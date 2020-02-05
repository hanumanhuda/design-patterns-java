package com.hhuda.dpj.observer;

public class Driver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        LCDDisplay lcdDisplay = new LCDDisplay(weatherStation);
        weatherStation.add(phoneDisplay);
        weatherStation.changeTemperature(66);
        weatherStation.add(lcdDisplay);
        weatherStation.changeTemperature(46);
    }
}

