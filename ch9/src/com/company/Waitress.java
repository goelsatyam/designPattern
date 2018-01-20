package com.company;

public class Waitress {
    BrekfastMenu breakfast;
    DinnerMenu dinner;

    public Waitress(BrekfastMenu breakfast, DinnerMenu dinner) {
        this.breakfast = breakfast;
        this.dinner = dinner;
    }

    public void printMenu() {
        Iterator brekfastIterator = breakfast.createIterator();
        Iterator dinnerIterator = dinner.createIterator();


    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
