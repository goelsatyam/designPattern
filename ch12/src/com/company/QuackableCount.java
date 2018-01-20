package com.company;

public class QuackableCount implements Quackable {
    static int count = 0;
    Quackable q;

    public  QuackableCount(Quackable q) {
        this.q = q;
    }

    public void quack() {
        q.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }
}
