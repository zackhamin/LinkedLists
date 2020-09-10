package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Lists without a type <Interger> can hold a mix of information.

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(1);
//        System.out.println(list.contains(25));
//        System.out.println(list.indexOf(20));
//        System.out.println(list.size());
//        System.out.println(list);
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));

       var list = new LinkedList();

        list.addLast();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(40);
        list.addFirst(99);
        System.out.println(list.indexOf(45));
        System.out.println(list.contains(99));
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
