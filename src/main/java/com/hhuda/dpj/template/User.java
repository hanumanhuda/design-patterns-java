package com.hhuda.dpj.template;

public class User extends Record {
    @Override
    public void validate() {
        System.out.println("user is validated");
    }

    @Override
    public void executeOnFail() {
        System.out.println("rolled back on fail");
    }
}
