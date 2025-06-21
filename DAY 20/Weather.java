/* The system includes a central weather station that keeps track of temperature.
Whenever the temperature changes, it should automatically notify all registered display devices.*/

import java.util.*;

interface Observer {
    void update(float temperature);
}

interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println(o + " removed successfully");
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temperature);
        }
    }
}

class DisplayDevice implements Observer {
    private String name;

    public DisplayDevice(String name) {
        this.name = name;
    }

    public void update(float temperature) {
        System.out.println(name + " received temperature update: " + temperature + " celcius");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Weather {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        DisplayDevice device1 = new DisplayDevice("Device 1");
        DisplayDevice device2 = new DisplayDevice("Device 2");
        DisplayDevice device3 = new DisplayDevice("Device 3");

        station.addObserver(device1);
        station.addObserver(device2);
        station.addObserver(device3);

        station.removeObserver(device2);

        station.setTemperature(28.5f);
        station.setTemperature(30.5f);
    }
}