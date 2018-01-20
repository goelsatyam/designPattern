package com.company;

public class HasQuaterState implements State {

    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println("You can't insert another quater");
    }

    public void ejectQuater() {
        System.out.println("Quater returned");
    }

    public void turnCrank() {
        System.out.println("You turnned ....");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
