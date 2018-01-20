package com.company;

public class NYstore extends pizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "cheese") {
            pizza = new NYstyleCheesePizza();
        }

        return pizza;
    }
}
