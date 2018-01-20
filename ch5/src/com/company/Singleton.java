package com.company;

public class Singleton {
    private static Singleton uniqueInstance = null;
    //private static Singleton uniqueInstance = new Singleton();

    /* we can use synchronized in case of multiThreading

         public synchronized static Singleton getInstance() {
          if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
          }
            return uniqueInstance;
        }

        OR

        public  static Singleton getInstance() {
          if(uniqueInstance == null) {
             Synchronised (Singleton.class) {
                if(uniqueInstance  == null){
                    uniqueInstance = new Singleton();
                }
             }
          }
            return uniqueInstance;
        }
    */

    private Singleton() { }

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
