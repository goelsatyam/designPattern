package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //This is implementation of object adapter pattter
    /*There is also class adapter which needs multiple
        inheritance but not possible in java.we inherit behaviour
        of both class into one.
     */

    /*Facaed patter provide a undined interface to a
      set of interfaces in a subsystem. Faced defines higher
      level interface that make the subsystem easier to use.
      eg- we can make watchMovie() which performs all steps
          involved in start to end for watching a movie.
          if components changes then we have to change only
          in faced pattern used interface(may we change Dvd wiht cd player).

    */
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        testDuck(mallardDuck);
        testTurkey(wildTurkey);

        DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter((wildTurkey));

        testDuck(turkeyAdapter);
        testTurkey(duckAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
