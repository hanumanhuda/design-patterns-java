package com.hhuda.dpj.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
    private List<Observer> observers =new ArrayList<Observer>();
    int temperature;



    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void changeTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }
}
