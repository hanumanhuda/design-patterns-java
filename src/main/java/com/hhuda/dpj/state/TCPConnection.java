package com.hhuda.dpj.state;

public class TCPConnection {
    private TCPState tcpState;

    public TCPConnection(){
        this.tcpState=new TCPClosed(this);
    }

    void open(){
        this.tcpState.open();
    }

    void close(){
        this.tcpState.close();
    }

    void acknowledge(){
        this.tcpState.acknowledge();
    }

    void changeState(TCPState tcpState){
        this.tcpState = tcpState;
    }
}
