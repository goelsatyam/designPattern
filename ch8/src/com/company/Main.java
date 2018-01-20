package com.company;

public class Main {

    public static void main(String[] args) {

     /* this chapter is all about them Templet method
        templet method lets subclasses redifine
        certain steps of an algorithm without changing algo's structure
     */

    /* hook says we will make an method with default behaviour
        and it's upto subclasses to define or not to define the behaviour
     */

        CaffineBeverageWithHook test= new CoffeeWithHook();
        test.preparerecp();
        test= new TeaWithoutHook();
        test.preparerecp();
    }
}
