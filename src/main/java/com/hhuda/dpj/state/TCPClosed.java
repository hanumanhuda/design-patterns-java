package com.hhuda.dpj.state;

import javax.inject.Singleton;

@Singleton
public class TCPClosed implements TCPState{
    private TCPConnection tcpConnection;
    public TCPClosed(TCPConnection tcpConnection) {
        this.tcpConnection=tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("TCPClosed:open");
        this.tcpConnection.changeState(new TCPEstablished(tcpConnection));
    }

    @Override
    public void close() {

    }

    @Override
    public void acknowledge() {

    }
}
