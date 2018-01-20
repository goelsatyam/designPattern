package com.company;

public class Main {

    public static void main(String[] args) {
	    // this chapter is all about compound patterns
        // Compound pattern means using two or more pattern together to solve our problem

        //GooseAdapter is used to make it compatible with funtion simulate
            Quackable q1 = new MallardDuck();
            Quackable q2 = new GooseAdapter(new Goose());
            Main.simulate(q1);
            Main.simulate(q2);

        //we use Quackable count to keep count how many quacks has been called
            QuackableCount q3 = new QuackableCount(q1);
            QuackableCount q4 = new QuackableCount(q2);
            simulate(q3);
            simulate(q4);
            System.out.println(QuackableCount.getCount());

        //AbstractFactory is used to easily keep track of all ducks and create their object

            AbstractDuckFactory a = new CountingDuckFactory();
            q1 = a.createMallardDuck();
            q2 = a.createRedHeadDuck();
            simulate(q1);
            simulate(q2);

        //Flock helps us to add Duck object into the Flockobject and call quack for all of them at once

            Flock f = new Flock();
            f.add(q1);
            f.add(q2);
            f.quack();

        //
    }

    public static void simulate(Quackable object) {
        object.quack();
    }
}
