package com.hhuda.dpj.proxy;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        String book="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        LocalDateTime localDateTime1= LocalDateTime.now();
        LazyBookParserProxy lazyBookParserProxy = new LazyBookParserProxy(book);
        LocalDateTime localDateTime2= LocalDateTime.now();
        System.out.println("Result: "+lazyBookParserProxy.getNumberOfPages());
        LocalDateTime localDateTime3= LocalDateTime.now();
        long diff=localDateTime2.toEpochSecond(ZoneOffset.UTC)-localDateTime1.toEpochSecond(ZoneOffset.UTC);
        System.out.println("Time to instantiate :"+diff);
        diff=localDateTime3.toEpochSecond(ZoneOffset.UTC)-localDateTime2.toEpochSecond(ZoneOffset.UTC);
        System.out.println("Time to execute :"+diff);
    }
}
