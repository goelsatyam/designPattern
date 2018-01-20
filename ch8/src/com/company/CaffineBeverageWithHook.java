package com.company;

public abstract class CaffineBeverageWithHook {
    final void preparerecp() {
        boilwater();
        brew();
        pourInCup();
        if(coustmerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean coustmerWantsCondiments() {
        //this is hook method which has default behaviour.
        //this can be override by other subclasses if they want to do so.
        return true;
    }

    abstract void brew();
    abstract void addCondiments();

    void boilwater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
