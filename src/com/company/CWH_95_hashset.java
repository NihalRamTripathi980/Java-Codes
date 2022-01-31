package com.company;

import java.util.HashSet;

public class CWH_95_hashset {
    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>(20);
        HashSet<Integer> hs3 = new HashSet<>(20,0.5f);

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);

        System.out.println(hs1);

        hs1.clear();
        System.out.println(hs1);

    }
}
