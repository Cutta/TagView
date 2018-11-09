package com.cunoraz.tagview;

import android.graphics.drawable.Drawable;


public class Tag {

    private int id;
    private String text;
    private int tagTextColor;
    private float tagTextSize;
    private int layoutColor;
    private int layoutColorPress;
    private boolean isDeletable;
    private int deleteIndicatorColor;
    private float deleteIndicatorSize;
    private float radius;
    private String deleteIcon;
    private float layoutBorderSize;
    private int layoutBorderColor;
    private Drawable background;


    public Tag(String text) {
        init(0, text, Constants.DEFAULT_TAG_TEXT_COLOR, Constants.DEFAULT_TAG_TEXT_SIZE, Constants.DEFAULT_TAG_LAYOUT_COLOR, Constants.DEFAULT_TAG_LAYOUT_COLOR_PRESS,
                Constants.DEFAULT_TAG_IS_DELETABLE, Constants.DEFAULT_TAG_DELETE_INDICATOR_COLOR, Constants.DEFAULT_TAG_DELETE_INDICATOR_SIZE, Constants.DEFAULT_TAG_RADIUS, Constants.DEFAULT_TAG_DELETE_ICON, Constants.DEFAULT_TAG_LAYOUT_BORDER_SIZE, Constants.DEFAULT_TAG_LAYOUT_BORDER_COLOR);
    }

    private void init(int id, String text, int tagTextColor, float tagTextSize,
                      int layoutColor, int layoutColorPress, boolean isDeletable,
                      int deleteIndicatorColor,float deleteIndicatorSize, float radius,
                      String deleteIcon, float layoutBorderSize, int layoutBorderColor) {
        this.id = id;
        this.text = text;
        this.tagTextColor = tagTextColor;
        this.tagTextSize = tagTextSize;
        this.layoutColor = layoutColor;
        this.layoutColorPress = layoutColorPress;
        this.isDeletable = isDeletable;
        this.deleteIndicatorColor = deleteIndicatorColor;
        this.deleteIndicatorSize = deleteIndicatorSize;
        this.radius = radius;
        this.deleteIcon = deleteIcon;
        this.layoutBorderSize = layoutBorderSize;
        this.layoutBorderColor = layoutBorderColor;
    }

    public void setTagTextColor(int tagTextColor) {
        this.tagTextColor = tagTextColor;
    }

    public void setTagTextSize(float tagTextSize) {
        this.tagTextSize = tagTextSize;
    }

    public void setLayoutColor(int layoutColor) {
        this.layoutColor = layoutColor;
    }

    public void setLayoutColorPress(int layoutColorPress) {
        this.layoutColorPress = layoutColorPress;
    }

    public void setDeletable(boolean deletable) {
        isDeletable = deletable;
    }

    public void setDeleteIndicatorColor(int deleteIndicatorColor) {
        this.deleteIndicatorColor = deleteIndicatorColor;
    }

    public void setDeleteIndicatorSize(float deleteIndicatorSize) {
        this.deleteIndicatorSize = deleteIndicatorSize;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setDeleteIcon(String deleteIcon) {
        this.deleteIcon = deleteIcon;
    }

    public void setLayoutBorderSize(float layoutBorderSize) {
        this.layoutBorderSize = layoutBorderSize;
    }

    public void setLayoutBorderColor(int layoutBorderColor) {
        this.layoutBorderColor = layoutBorderColor;
    }

    public void setBackground(Drawable background) {
        this.background = background;
    }

    public String getText() {
        return text;
    }

    public int getTagTextColor() {
        return tagTextColor;
    }

    public float getTagTextSize() {
        return tagTextSize;
    }

    public int getLayoutColor() {
        return layoutColor;
    }

    public int getLayoutColorPress() {
        return layoutColorPress;
    }

    public boolean isDeletable() {
        return isDeletable;
    }

    public int getDeleteIndicatorColor() {
        return deleteIndicatorColor;
    }

    public float getDeleteIndicatorSize() {
        return deleteIndicatorSize;
    }

    public float getRadius() {
        return radius;
    }

    public String getDeleteIcon() {
        return deleteIcon;
    }

    public float getLayoutBorderSize() {
        return layoutBorderSize;
    }

    public int getLayoutBorderColor() {
        return layoutBorderColor;
    }

    public Drawable getBackground() {
        return background;
    }
}
