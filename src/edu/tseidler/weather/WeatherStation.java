package edu.tseidler.weather;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherStation {
    private double temperature;
    private double pressure;
    private double humidity;

    private PropertyChangeSupport support;

    public WeatherStation(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setTemperature(double temperature) {
        support.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        support.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
    }

    public void setHumidity(double humidity) {
        support.firePropertyChange("humidity", this.humidity, humidity);
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }
}
