package com.hhuda.dpj.state;

public class Driver {
    public static void main(String[] args) {
        TCPConnection tcpConnection =new TCPConnection();
        tcpConnection.open();
        tcpConnection.open();
        tcpConnection.close();
    }
}
