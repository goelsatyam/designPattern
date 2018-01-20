package com.company;

import java.util.ArrayList;

public class DinnerMenu {
    static final int MAX_items = 6;
    int numberofitems = 0;
    MenuItem[] items;

    public DinnerMenu() {

    }

    public void add(MenuItem item) {
        if(numberofitems < MAX_items) {
            items[numberofitems] = item;
            numberofitems++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(items);
    }
}
