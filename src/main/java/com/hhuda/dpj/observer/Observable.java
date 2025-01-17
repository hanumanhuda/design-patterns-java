package com.hhuda.dpj.observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
