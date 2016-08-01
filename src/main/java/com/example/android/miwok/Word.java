package com.example.android.miwok;

/**
 * Created by zan on 01/08/2016.
 */
public class Word {
    private String mDefaultTransalation;
    private String mMiwokTranslation;

    public Word(String defaultTrans, String miwokTrans){
        mDefaultTransalation = defaultTrans;
        mMiwokTranslation = miwokTrans;
    }

    public String getDefaultTrans(){
        return mDefaultTransalation;
    }

    public String getMiwokTrans(){
        return mMiwokTranslation;
    }
}
