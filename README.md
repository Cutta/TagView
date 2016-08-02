#Android TagView
Android TagView-HashTagView

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-TagView-green.svg?style=flat)](https://android-arsenal.com/details/1/2566)

Simple android view to display collection of colorful tags efficiently.
You can edit the tag's style, and set listener of selecting or deleting tag. 
Example usages can be found in example project.

#Screen
<img src="http://s11.postimg.org/rry7lw877/Screenshot_2015_09_29_21_17_53.png"></img>
<img src="http://i.giphy.com/3oEduFls2tAwrOALzG.gif"></img>


#Feature
* Editable Style of Text, such as Font size and color.
* Editable Style of Tag, Background/Pressed Color, Radius effect, Custom Background, Delete mode.
* Listener of tag selecting and deleting.
* Can be created from XML file or Java code.

#Gradle
 ``` java
repositories {
    maven {
        url "https://jitpack.io"
    }
}
 ```
 ``` java
dependencies {
    compile 'com.github.Cutta:TagView:1.1'
}
 ```
#Usage
 <pre style='color:#000000;background:#ffffff;'><span style='color:#a65700; '>&lt;</span><span style='color:#5f5035; '>com.cunoraz.tagview.TagView</span>
            <span style='color:#007997; '>android</span><span style='color:#800080; '>:</span><span style='color:#274796; '>id</span><span style='color:#808030; '>=</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>@+id/tag_group</span><span style='color:#800000; '>"</span>
            <span style='color:#007997; '>android</span><span style='color:#800080; '>:</span><span style='color:#274796; '>layout_width</span><span style='color:#808030; '>=</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>match_parent</span><span style='color:#800000; '>"</span>
            <span style='color:#007997; '>android</span><span style='color:#800080; '>:</span><span style='color:#274796; '>layout_height</span><span style='color:#808030; '>=</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>match_parent</span><span style='color:#800000; '>"</span>
            <span style='color:#007997; '>android</span><span style='color:#800080; '>:</span><span style='color:#274796; '>layout_margin</span><span style='color:#808030; '>=</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>10dp</span><span style='color:#800000; '>"</span> <span style='color:#a65700; '>/></span>
</pre>
 
 ``` java
 TagView tagGroup = (TagView)findviewById(R.id.tag_view);
 //You can add one tag
 tagGroup.addTag(Tag tag);
 //You can add multiple tag via ArrayList
 tagGroup.addTags(ArrayList<Tag> tags);
 //Via string array
 addTags(String[] tags);
 
  
   //set click listener
      tagGroup.setOnTagClickListener(new OnTagClickListener() {
            @Override
            public void onTagClick(Tag tag, int position) {
            }
        });
        
   //set delete listener
            tagGroup.setOnTagDeleteListener(new OnTagDeleteListener() {
            @Override
            public void onTagDeleted(final TagView view, final Tag tag, final int position) {
            }
        });
```       

#Sample APK
https://www.dropbox.com/s/m1y1npssj5b4bck/app-debug.apk?dl=0

#License
Copyright 2015 Cüneyt Çarıkçi.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
