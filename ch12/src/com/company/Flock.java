package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
   ArrayList<Quackable> list = new ArrayList<Quackable>();

    public Flock() {

    }

    public void add(Quackable q) {
        list.add(q);
    }

    public void quack() {
        Iterator<Quackable> iterator = list.iterator();

        while(iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }
}
