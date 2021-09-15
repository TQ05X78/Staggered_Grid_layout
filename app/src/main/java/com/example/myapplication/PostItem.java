package com.example.myapplication;

public class PostItem {


    private int image;

    private String text;
    private String anotherText;


    public PostItem(int image, String text, String anotherText) {
        this.image = image;
        this.text = text;
        this.anotherText = anotherText;
    }

    public int getImage() {
        return image;
    }


    public String getText() {
        return text;
    }


    public String getAnotherText() {
        return anotherText;
    }
}
