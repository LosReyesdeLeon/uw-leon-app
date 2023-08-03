package edu.tacoma.uw.set.css.dpeevy.uwleonapp;
import java.io.Serializable;

public class NewsArticle implements Serializable {

    private int id;
    private String image, date, text, link;

    public final static String ID = "id";
    public final static String IMAGE = "image";
    public final static String DATE = "date";
    public final static String TEXT = "text";
    public final static String LINK = "link";

    public NewsArticle(int id, String image, String date, String text, String link) {
        this.id = id;
        this.image = image;
        this.date = date;
        this.text = text;
        this.link = link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
