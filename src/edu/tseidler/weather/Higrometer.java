package edu.tseidler.weather;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Higrometer implements PropertyChangeListener {
    final String name;
    double temperature;
    double humidity;

    Higrometer(String name, double temperature, double humidity) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equalsIgnoreCase("temperature") && isTempChangeSignificant(this.temperature, (double) evt.getNewValue()))
            this.temperature = (double) evt.getNewValue();
        else if (evt.getPropertyName().equalsIgnoreCase("humidity") && isHumidityChangeSignificant(this.humidity, (double) evt.getNewValue()))
            this.humidity = (double) evt.getNewValue();
        else return;
        System.out.println(this);
    }

    abstract boolean isTempChangeSignificant(double oldTemperature, double newTemperature);

    abstract boolean isHumidityChangeSignificant(double oldHumidity, double newHumidity);

    @Override
    public String toString() {
        String sb = "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity;
        return sb;
    }

}
