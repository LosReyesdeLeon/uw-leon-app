package edu.tacoma.uw.set.css.dpeevy.uwleonapp;
import java.io.Serializable;

public class NewsArticle implements Serializable {

    private int id;
    private String name, image, date, text, link;

    public final static String ID = "id";
    public final static String NAME = "name";
    public final static String IMAGE = "image";
    public final static String DATE = "date";
    public final static String TEXT = "text";
    public final static String LINK = "link";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewsArticle(int id, String name, String image, String date, String text, String link) {
        this.id = id;
        this.name = name;
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
