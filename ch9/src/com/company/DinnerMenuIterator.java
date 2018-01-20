package com.company;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        return items[position++];
    }

    public boolean hasNext() {
        if (position < items.length || items[position] == null)
            return true;
        else
            return false;
    }
}
