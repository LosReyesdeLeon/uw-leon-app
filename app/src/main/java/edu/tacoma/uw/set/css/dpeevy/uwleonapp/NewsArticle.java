package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

public class NewsArticle {
    private int dataImage;
    private int dataTitle;
    private String dataDate;

    public NewsArticle(int dataTitle, String dataDate, int dataImage) {
        this.dataTitle = dataTitle;
        this.dataDate = dataDate;
        this.dataImage = dataImage;
    }

    public int getDataTitle() {
        return dataTitle;
    }
    public String getDataDate() {
        return dataDate;
    }

    public int getDataImage() {
        return dataImage;
    }

}
