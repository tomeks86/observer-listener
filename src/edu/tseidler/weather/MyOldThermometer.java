package edu.tseidler.weather;

public class MyOldThermometer extends Thermometer {
    private double tempEps = 2;
    private double pressEps = 10;

    public MyOldThermometer(String name, double temperature, double pressure) {
        super(name, temperature, pressure);
    }

    @Override
    boolean isTempChangeSignificant(double oldTemperature, double newTemperature) {
        return Math.abs(oldTemperature - newTemperature) > tempEps;
    }

    @Override
    boolean isPressureChangeSignificant(double oldPressure, double newPressure) {
        return Math.abs(oldPressure - newPressure) > pressEps;
    }
}
