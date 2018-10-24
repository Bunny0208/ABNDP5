package com.example.android.abndp5;

public class Word {
private String title;

    private String description;
    private int mresourceId =NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String heading, String info, int resourceId)
    {
        title = heading;
        description = info;
        mresourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public int getResourceId() { return  mresourceId;}
    public boolean hasImage()
    {
        return mresourceId != NO_IMAGE_PROVIDED;
    }

}
