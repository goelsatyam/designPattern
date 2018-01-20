package com.company;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {
    ArrayList<MenuItem> items = null;
    int position = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        items = new ArrayList<MenuItem>();
        this.items = items;
    }

    public MenuItem next() {
        return items.get(position++);
    }

    public boolean hasNext() {
        if (position < items.size())
            return true;
        else
            return false;
    }
}
