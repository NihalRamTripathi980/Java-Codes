package com.company;

import java.util.ArrayDeque;

public class CWH_93_arrayDeque {



    public static void main(String [] args){

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(23);
        ad1.add(43);
        ad1.add(434);
        ad1.add(234);

        // INSERT
        ad1.addFirst(1); // Its throw  sometimes Exception
        ad1.offerFirst(11);   // It is used to initialize the at the first of the Deque safely , we can both methods addFirst() or offerFirst()
        ad1.addLast(9); // or
        ad1.offerLast(10);


        ad2.add(180);
        ad2.addFirst(190);
        ad1.addAll( ad2) ; // it adds all the value of arraydeque ad2 in ad1
        System.out.println(ad2);
        //

        // REMOVE
        ad1.removeLast();

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
