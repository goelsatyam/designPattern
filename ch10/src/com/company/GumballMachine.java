package com.company;

public class GumballMachine {
    State soldOutState;
    State noQuaterState;
    State hasQuaterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberofGumball) {

        soldOutState = new SoldOutState(this);
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        if(numberofGumball>0) {
            this.state = noQuaterState;
        }
        else{
            this.state = soldOutState;
        }

    }

    public void insertQuater() {
        state.insertQuater();
    }

    public void ejectQuater() {
        state.ejectQuater();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count!=0) {
            count = count - 1;
        }
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
