package com.example.android.miwok;

import android.view.View;
import android.widget.TextView;

/**
 * Created by zan on 01/08/2016.
 */
public class Word {
    private String mDefaultTransalation;
    private String mMiwokTranslation;
    private int mImgResID = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mAudioResourceID;

    public Word(String defaultTrans, String miwokTrans, int audio){
        mDefaultTransalation = defaultTrans;
        mMiwokTranslation = miwokTrans;
        mAudioResourceID = audio;
    }

    public Word(String defaultTrans, String miwokTrans, int mImgageResourceID, int audio){
        mDefaultTransalation = defaultTrans;
        mMiwokTranslation = miwokTrans;
        mImgResID = mImgageResourceID;
        mAudioResourceID = audio;
    }

    public String getDefaultTrans(){

        return mDefaultTransalation;
    }

    public String getMiwokTrans(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
        return mImgResID;
    }

    public boolean hasImage(){
        return mImgResID != NO_IMAGE;
    }

    public int getmAudioResourceID(){
        return mAudioResourceID;
    }
}
