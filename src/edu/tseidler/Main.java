package edu.tseidler;

import edu.tseidler.observer.OnewsAgency;
import edu.tseidler.observer.OnewsChannel;
import edu.tseidler.propertychangelistener.PCLNewsAgency;
import edu.tseidler.propertychangelistener.PCLNewsChannel;
import edu.tseidler.standard.NewsAgency;
import edu.tseidler.standard.NewsChannel;

public class Main {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel("channel 1");
        NewsChannel observer2 = new NewsChannel("channel 2");
        NewsChannel observer3 = new NewsChannel("channel 3");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.setNews("news");

        observable.removeObserver(observer2);
        observable.setNews("news2");
        System.out.println();

        OnewsAgency oobservable = new OnewsAgency();
        OnewsChannel oobserver1 = new OnewsChannel("kan 1");
        OnewsChannel oobserver2 = new OnewsChannel("kan 2");
        OnewsChannel oobserver3 = new OnewsChannel("kan 3");
        OnewsChannel oobserver4 = new OnewsChannel("kan 4");
        OnewsChannel oobserver5 = new OnewsChannel("kan 5");

        oobservable.addObserver(oobserver1);
        oobservable.addObserver(oobserver2);
        oobservable.addObserver(oobserver3);
        oobservable.addObserver(oobserver4);
        oobservable.addObserver(oobserver5);

        oobservable.setNews("aaa");
        oobservable.deleteObserver(oobserver2);
        oobservable.setNews("aaaaaa");
        System.out.println();

        PCLNewsAgency ooobservable = new PCLNewsAgency();
        PCLNewsChannel ooobserver1 = new PCLNewsChannel("la une");
        PCLNewsChannel ooobserver2 = new PCLNewsChannel("la deux");
        PCLNewsChannel ooobserver3 = new PCLNewsChannel("la trois");

        ooobservable.addPropertyChangeListener(ooobserver1);
        ooobservable.addPropertyChangeListener(ooobserver2);
        ooobservable.addPropertyChangeListener(ooobserver3);
        ooobservable.setNews("zutt");

        ooobservable.removePropertyChangeListener(ooobserver2);
        ooobservable.setNews("putain!");
    }
}
