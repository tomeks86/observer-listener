package edu.tseidler;

import edu.tseidler.observer.OnewsAgency;
import edu.tseidler.observer.OnewsChannel;
import edu.tseidler.propertychangelistener.PCLNewsAgency;
import edu.tseidler.propertychangelistener.PCLNewsChannel;
import edu.tseidler.standard.NewsAgency;
import edu.tseidler.standard.NewsChannel;
import edu.tseidler.weather.*;

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
        System.out.println();
        System.out.println();

        WeatherStation weatherStation = new WeatherStation(15, 1025, 50);
        Thermometer thermometer1 = new MyPreciseThermometer("termometr 1", weatherStation.getTemperature(), weatherStation.getPressure());
        Thermometer thermometer2 = new MyOldThermometer("termometr 2", weatherStation.getTemperature(), weatherStation.getPressure());
        Higrometer higrometer = new MyHigrometer("higrometer", weatherStation.getTemperature(), weatherStation.getHumidity());
        weatherStation.addTempPropertyChangeListener(thermometer1);
        weatherStation.addPressurePropertyChangeListener(thermometer1);
        weatherStation.addTempPropertyChangeListener(thermometer2);
        weatherStation.addPressurePropertyChangeListener(thermometer2);
        weatherStation.addTempPropertyChangeListener(higrometer);
        weatherStation.addHumidityPropertyChangeListener(higrometer);

        System.out.println("temp change!");
        weatherStation.setTemperature(17);
        System.out.println("pressure change!");
        weatherStation.setPressure(1030);
        System.out.println();
//        weatherStation.setHumidity(20);
        System.out.println();
        System.out.println("temp change!");
        weatherStation.setTemperature(12);
        System.out.println("pressure change!");
        weatherStation.setPressure(1010);
        System.out.println();
        System.out.println("humidity change!");
        weatherStation.setHumidity(10);
        System.out.println();

        weatherStation.removeTempPropertyChangeListener(higrometer);
        System.out.println("higrometer removed from tempchangelisteners");
        System.out.println("temp change!");
        weatherStation.setTemperature(35);
    }
}
