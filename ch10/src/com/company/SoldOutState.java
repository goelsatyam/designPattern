package com.company;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println("You can't insert quater, the machine is sold out");
    }

    public void ejectQuater() {
        System.out.println("You can't eject, you haven't inserted quater");
    }

    public void turnCrank() {
        System.out.println("You turnned but there is not gumball");
    }

    public void dispense() {
        System.out.println("No gumball dispense");
    }

    public String toString() {
        return "soldOut";
    }
}
