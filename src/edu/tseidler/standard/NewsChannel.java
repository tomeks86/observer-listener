package edu.tseidler.standard;

import edu.tseidler.Channel;

public class NewsChannel implements Channel {
    private final String name;
    private String news;

    public NewsChannel(String name) {
        this.name = name;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
        System.out.println(this.name + " news: " + this.news);
    }
}
