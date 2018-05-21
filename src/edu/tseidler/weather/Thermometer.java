package edu.tseidler.weather;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Thermometer implements PropertyChangeListener {
    final String name;
    double temperature;
    double pressure;

    Thermometer(String name, double temperature, double pressure) {
        this.name = name;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equalsIgnoreCase("temperature") && isTempChangeSignificant(this.temperature, (double) evt.getNewValue()))
            this.temperature = (double) evt.getNewValue();
        else if (evt.getPropertyName().equalsIgnoreCase("pressure") && isPressureChangeSignificant(this.pressure, (double) evt.getNewValue()))
            this.pressure = (double) evt.getNewValue();
        else return;
        System.out.println(this);
    }

    abstract boolean isTempChangeSignificant(double oldTemperature, double newTemperature);

    abstract boolean isPressureChangeSignificant(double oldPressure, double newPressure);

    @Override
    public String toString() {
        String sb = "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", pressure=" + pressure;
        return sb;
    }
}
