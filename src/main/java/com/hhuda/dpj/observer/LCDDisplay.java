package com.hhuda.dpj.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LCDDisplay implements Observer {
    private WeatherStation weatherStation;
    public void update() {
        System.out.println(this+",Current Temperature: "+weatherStation.getTemperature());
    }
}
