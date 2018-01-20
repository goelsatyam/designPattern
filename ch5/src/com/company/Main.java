package com.company;

public class Main {

    public static void main(String[] args) {
	// we can make only one object of singleton class
    //Singleton a = new Singleton() will show error

        Singleton a = Singleton.getInstance();
    }
}
