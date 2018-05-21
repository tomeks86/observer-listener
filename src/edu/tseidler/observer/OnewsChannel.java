package edu.tseidler.observer;

import java.util.Observable;
import java.util.Observer;

public class OnewsChannel implements Observer {
    private final String name;
    private String news;

    public OnewsChannel(String name) {
        this.name = name;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
        System.out.println(this.name + " news: " + this.news);
    }
}
