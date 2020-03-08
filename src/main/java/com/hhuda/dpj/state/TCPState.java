package com.hhuda.dpj.state;

public interface TCPState {
    void open();
    void close();
    void acknowledge();
}
