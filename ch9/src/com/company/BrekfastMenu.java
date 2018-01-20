package com.company;

import com.company.BreakfastMenuIterator;
import com.company.Iterator;
import com.company.MenuItem;

import java.util.ArrayList;

public class BrekfastMenu {
    int numberofitems = 0;
    ArrayList<MenuItem> menuItems = null;

    public BrekfastMenu() {
        menuItems = new ArrayList<MenuItem>();
    }

    public void add(MenuItem item) {
        menuItems.add(item);
    }

    public Iterator createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}
