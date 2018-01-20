package com.company;

public class Main {

    public static void main(String[] args) {
	// state patter
     /*
        In this patter rather tha using integers and if/else values
        for changing states from one to another e.g- from noQuaterState to hasQuater
        we make a common interface for states and each state has its own concerete class.
        then we can change from one state to another without using if/else condition.
        this pattern helps us to make code managablr and without if/else condition which
        can we very bad when we have many states.

        like in this code we can easily add state e.g- winnerState in which
        when person inset quater then turnCrank and then machine decide he/she winner
        with probablity of 0.2.If they are winner they get 2 gumballs otherwise 1 like in soldState;
      */
    }
}
