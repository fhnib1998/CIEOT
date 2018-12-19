package com.example.fhnib.fhnibcieot.CustomView;

public class Meoj {
    private String meoj;
    private int image;

    public Meoj(String meoj, int image) {
        this.meoj = meoj;
        this.image = image;
    }

    public String getMeoj() {
        return meoj;
    }

    public void setMeoj(String meoj) {
        this.meoj = meoj;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
