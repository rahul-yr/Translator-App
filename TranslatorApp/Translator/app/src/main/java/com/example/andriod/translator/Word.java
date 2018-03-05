package com.example.andriod.translator;

/**
 * Created by yarra on 01-03-2018.
 */

public class Word {

    private String englishWord,translatedWord;
    private int imageResourceId=IMAGE_ID;
    public static final int IMAGE_ID=-1;

    public Word(String englishWord,String translatedWord){
        this.englishWord=englishWord;
        this.translatedWord=translatedWord;
    }
    public Word(String englishWord,String translatedWord,int imageResourceId){
        this.englishWord=englishWord;
        this.translatedWord=translatedWord;
        this.imageResourceId=imageResourceId;
    }
    public String getEnglishWord(){
        return englishWord;
    }
    public String getTranslatedWord(){
        return translatedWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
