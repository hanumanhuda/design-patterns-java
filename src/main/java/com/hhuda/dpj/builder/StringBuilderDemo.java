package com.hhuda.dpj.builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("started ");

        sb.append("with builder ");
        sb.append("for design pattern ");
        sb.append(43);

        System.out.println(sb.toString());
    }
}
