package com.hhuda.dpj.state;

import javax.inject.Singleton;

@Singleton
public class TCPListen implements TCPState {
    private TCPConnection tcpConnection;
    public TCPListen(TCPConnection tcpConnection) {
        this.tcpConnection=tcpConnection;
    }
    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.println("TCPListen: close");
        this.tcpConnection.changeState(new TCPClosed(this.tcpConnection));
    }

    @Override
    public void acknowledge() {

    }
}
