package com.company;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackableCount(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {

        return new QuackableCount(new RedHeadDuck());
    }
}
