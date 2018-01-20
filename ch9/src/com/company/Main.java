package com.company;

public class Main {

    public static void main(String[] args) {
	// Iterator pattern
    /*
      this patter helps us to iterate over different collections(like arrays,hashmaps,etc)
      using interface Iterator rather than using different loop over differrent collections.
      In this code we try to make interface Iterator for Dinner(Array of menuItems) and
      BreakfastMenu(ArrayList usind in menuItems) anditerate over them using same function rather
      creating differernt function for both of them.

      we can make improvement in this code by making common interface Menu for DinerMenu and breakFast
      menu but main Iterator patter is explained above it's just improvement!!.

      we can also add andother menu for lunch(maybe using hasMaps) and we can easily add without
      changing much code in Waitress class. -- Awesome
     */


    //Composite Pattern pg: 364-368
    /*
        this patter is used if we have submenu in out menu.

              menu
            /   |   \
      MenuItem       Submenu
                    /    |
             MenuItem   submenu

       this makes a tree like structure and we can use common abstract class for both leaf(menuItem) and
       non-leaf(submenu).abstract class will have default for its funtion(eg.throw exeption unsupported())
       Leaf can override function it want to use and non-leaf override they want to use.
       eg. abstract class Component {operation(); add(Component); remove(Component); getChild(int)}
           leaf- Leaf extents Component {operation();}
           nonLeaf - nonLeaf extends Component((Component); remove(Component); getChild(int))
     */
    }
}
