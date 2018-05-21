package edu.tseidler.weather;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherStation {
    private double temperature;
    private double pressure;
    private double humidity;

    private PropertyChangeSupport temperatureSupport;
    private PropertyChangeSupport pressureSupport;
    private PropertyChangeSupport humiditySupport;

    public WeatherStation(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        temperatureSupport = new PropertyChangeSupport(this);
        pressureSupport = new PropertyChangeSupport(this);
        humiditySupport = new PropertyChangeSupport(this);
    }

    public void addTempPropertyChangeListener(PropertyChangeListener pcl) {
        temperatureSupport.addPropertyChangeListener(pcl);
    }

    public void addPressurePropertyChangeListener(PropertyChangeListener pcl) {
        pressureSupport.addPropertyChangeListener(pcl);
    }

    public void addHumidityPropertyChangeListener(PropertyChangeListener pcl) {
        humiditySupport.addPropertyChangeListener(pcl);
    }

    public void removeTempPropertyChangeListener(PropertyChangeListener pcl) {
        temperatureSupport.removePropertyChangeListener(pcl);
    }

    public void removePressurePropertyChangeListener(PropertyChangeListener pcl) {
        pressureSupport.removePropertyChangeListener(pcl);
    }

    public void removeHumidityPropertyChangeListener(PropertyChangeListener pcl) {
        humiditySupport.removePropertyChangeListener(pcl);
    }

    public void setTemperature(double temperature) {
        temperatureSupport.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        pressureSupport.firePropertyChange("pressure", this.pressure, pressure);
        this.pressure = pressure;
    }

    public void setHumidity(double humidity) {
        humiditySupport.firePropertyChange("humidity", this.humidity, humidity);
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
