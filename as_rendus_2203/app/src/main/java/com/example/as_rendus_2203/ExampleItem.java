package com.example.as_rendus_2203;

public class ExampleItem {
    private int mImageResource;
    private String mNomPat;

    public ExampleItem(int image, String nomPat){
        mImageResource = image;
        mNomPat = nomPat;
    }

    public int getImageResource(){
        return mImageResource;
    }

    public String getNomPat(){
        return mNomPat;
    }
}
