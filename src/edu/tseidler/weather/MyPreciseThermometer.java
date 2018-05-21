package edu.tseidler.weather;

public class MyPreciseThermometer extends Thermometer {

    public MyPreciseThermometer(String name, double temperature, double pressure) {
        super(name, temperature, pressure);
    }

    @Override
    boolean isTempChangeSignificant(double oldTemperature, double newTemperature) {
        return true;
    }

    @Override
    boolean isPressureChangeSignificant(double oldPressure, double newPressure) {
        return true;
    }

    @Override
    public String toString() {
        String sb = "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", pressure=" + pressure;
        return sb;
    }
}
