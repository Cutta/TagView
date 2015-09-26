package cuneyt.example.com.tagview.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cuneyt.example.com.tagview.R;
import cuneyt.example.com.tagview.Tag.Constants;
import cuneyt.example.com.tagview.Tag.OnTagClickListener;
import cuneyt.example.com.tagview.Tag.OnTagDeleteListener;
import cuneyt.example.com.tagview.Tag.Tag;
import cuneyt.example.com.tagview.Tag.TagView;
import cuneyt.example.com.tagview.Models.TagClass;
import me.drakeet.materialdialog.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.tag_group)
    TagView tagGroup;

    @InjectView(R.id.editText)
    EditText editText;


    /**
     * sample country list
     */
    ArrayList<TagClass> tagList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        prepareTags();


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setTags(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tagGroup.setOnTagClickListener(new OnTagClickListener() {
            @Override
            public void onTagClick(Tag tag, int position) {
                editText.setText(tag.text);
                editText.setSelection(tag.text.length());//to set cursor position

            }
        });
        tagGroup.setOnTagDeleteListener(new OnTagDeleteListener() {

            @Override
            public void onTagDeleted(final TagView view, final Tag tag, final int position) {

                final MaterialDialog dialog = new MaterialDialog(MainActivity.this);
                dialog.setMessage("\"" + tag.text + "\" will be delete. Are you sure?");
                dialog.setPositiveButton("Yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        view.remove(position);
                        Toast.makeText(MainActivity.this, "\"" + tag.text + "\" deleted", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                dialog.setNegativeButton("No", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });


    }

    private void prepareTags() {
        tagList = new ArrayList<>();
        JSONArray jsonArray = null;
        JSONObject temp;
        try {
            jsonArray = new JSONArray(Constants.COUNTRIES);
            for (int i = 0; i < jsonArray.length(); i++) {
                temp = jsonArray.getJSONObject(i);
                tagList.add(new TagClass(temp.getString("code"), temp.getString("name")));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setTags(CharSequence cs) {
        String text = cs.toString();
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag;
        /**
         * counter for prevent frozen effect
         * if the tags number is greather than 20 some device will a bit frozen
         */
        int counter = 0;

        /**
         * for empty edittext
         */
        if (text.equals("")) {
            tagGroup.addTags(new ArrayList<Tag>());
            return;
        }

        for (int i = 0; i < tagList.size(); i++) {
            if (tagList.get(i).getName().toLowerCase().startsWith(text.toLowerCase())) {
                tag = new Tag(tagList.get(i).getName());
                tag.radius = 10f;
                tag.layoutColor = (Color.parseColor(tagList.get(i).getColor()));
                if (i % 2 == 0) // you can set deletable or not
                    tag.isDeletable = true;
                tags.add(tag);
                counter++;
                /**
                 * if you don't want show all tags. You can set a limit.
                 if (counter == 10)
                 break;
                 */

            }
        }
        tagGroup.addTags(tags);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
