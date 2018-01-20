package com.company;

public class NoQuaterState implements State {

    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println("You inserted Quater");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }

    public void ejectQuater() {
        System.out.println("You haven't inserted quater");
    }

    public void turnCrank() {
        System.out.println("You turnned but there is no quater");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
