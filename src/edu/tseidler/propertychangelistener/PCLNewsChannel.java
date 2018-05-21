package edu.tseidler.propertychangelistener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {
    private final String name;
    private String news;

    public PCLNewsChannel(String name) {
        this.name = name;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
        System.out.println(this.name + " news: " + this.news);
    }
}
