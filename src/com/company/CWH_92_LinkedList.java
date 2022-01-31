package com.company;


import java.util.*;

public class CWH_92_LinkedList {
    public static void main(String[] args) {
           LinkedList <Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(22);
            l2.add(23);
            l2.add(24);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(1,5);
            l1.add(2);
            l1.add(7);
            l1.set(1,2222);
            // l1.add(1,2221);
        l1.addFirst(2334);
        l1.addLast(234443);
        System.out.println(l1);
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());
        System.out.println(l1.peek());   // peek first element of the array
        System.out.println(l1.clone());
      //  System.out.println(l1.stream().peek());
        System.out.println(l1.pollLast());
        l1.push(333);
       // l1.pop();

            // l1.clear();         // here i would clear l1 values using l1.clear keyword

            l1.addAll(l2);

            //l1.addAll(0,l2);
            System.out.println(l1.contains(4));          // for checking the value who is available or not in the arrayList

            System.out.println(l1.indexOf(2));           // by using this We can also know the index by giving the value
            System.out.println(l1.lastIndexOf(2));
            l1.remove(3);
            System.out.println(l1.isEmpty());
            for (int i=0;i<l1.size();i++){
                System.out.print(l1.get(i));
                System.out.print( "  ,");
            }


}
}
