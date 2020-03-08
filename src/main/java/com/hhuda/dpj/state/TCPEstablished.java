package com.hhuda.dpj.state;

import javax.inject.Singleton;

@Singleton
public class TCPEstablished implements TCPState {
    private TCPConnection tcpConnection;
    public TCPEstablished(TCPConnection tcpConnection) {
        this.tcpConnection=tcpConnection;
    }
    @Override
    public void open() {
        System.out.println("TCPEstablished: open");
        this.tcpConnection.changeState(new TCPListen(this.tcpConnection));
    }

    @Override
    public void close() {

    }

    @Override
    public void acknowledge() {

    }
}
