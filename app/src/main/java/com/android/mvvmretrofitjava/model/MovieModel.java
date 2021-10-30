package com.android.mvvmretrofitjava.model;

public class MovieModel {
    private String id;
    private String img_src;


    public MovieModel(String title, String image) {
        this.id = title;
        this.img_src = image;
    }
    public String getTitle() {
        return id;
    }

    public void setTitle(String title) {
        this.id = title;
    }

    public String getImage() {
        return img_src;
    }

    public void setImage(String image) {
        this.img_src = image;
    }





}
