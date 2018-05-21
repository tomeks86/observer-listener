package edu.tseidler.weather;

public class MyHigrometer extends Higrometer {
    public MyHigrometer(String name, double temperature, double humidity) {
        super(name, temperature, humidity);
    }

    @Override
    boolean isTempChangeSignificant(double oldTemperature, double newTemperature) {
        return true;
    }

    @Override
    boolean isHumidityChangeSignificant(double oldHumidity, double newHumidity) {
        return true;
    }
}