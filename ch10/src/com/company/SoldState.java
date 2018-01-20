package com.company;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuater() {
        System.out.println("Please we are already giving you gumball");
    }

    public void ejectQuater() {
        System.out.println("You already turn...");
    }

    public void turnCrank() {
        System.out.println("Turning can't give you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() >0) {
            gumballMachine.setState(gumballMachine.getNoQuaterState());
        }
        else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return "soldOut";
    }
}
