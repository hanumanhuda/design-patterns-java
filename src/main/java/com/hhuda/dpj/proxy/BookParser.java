package com.hhuda.dpj.proxy;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * RealSubject
 */
public class BookParser implements IBookParser{
    private int numOfPages=0;
    public BookParser(String book) throws InterruptedException {
        sleep(10000);//Heavy Operation
        numOfPages = new Random().nextInt();
    }

    public int getNumberOfPages() {
        return this.numOfPages;
    }
}
