package edu.tseidler.observer;

import java.util.Observable;

public class OnewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
