package com.hhuda.dpj.singleton;

/**
 *thread safe singleton class
 */
public class BasicSingleton {
    //eagerly loaded
    //private static DbSingleton instance =new DbSingleton();
    //lazy loaded
    private static volatile BasicSingleton instance =null;

    /**
     * private constructor to disallow to use new
     * @return
     */
    private BasicSingleton(){
        if(instance !=null){
            throw new RuntimeException("use getInstance() method for instance");
        }
    }

    /**
     * lazy loaded to instance of DbSingleton class
     * @return
     */
    public static BasicSingleton getInstance(){
        if(instance == null){
            synchronized (BasicSingleton.class) {
                if (instance == null) {
                    instance = new BasicSingleton();
                }
            }
        }
        return instance;

    }


}
