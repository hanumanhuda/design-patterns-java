package com.hhuda.dpj.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<String,Book> prototypes=new HashMap<>();

    public static void addPrototype(String name,Book book){
        prototypes.put(name,book);
    }

    public static Book createPrototype(String name){
        for (Map.Entry<String, Book> entry: prototypes.entrySet()) {
            if (entry.getKey().equals(name)){
                return entry.getValue().clone();
            }
        }
        return null;
    }
}
