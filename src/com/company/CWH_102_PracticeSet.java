package com.company;

import javax.lang.model.element.Element;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_102_PracticeSet {
    public static  void main(String[] args) {

        // Problem 1
        ArrayList<String> al = new ArrayList<>();
        al.add("Manas ");
        al.add("Vikas  ");
        al.add("Pawan");
        al.add("Vishal ");
        al.add("Mayank ");
        al.add("Ritesh ");
        al.add("Sumit ");
        al.add("Krishna ");
        al.add("Mahesh ");

        System.out.println(al);

        for (Object o:al){
            System.out.println(o);
        }

        // Problem 2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Problem 3
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Problem 5
        LocalDateTime time =  LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String myDate =time.format(df);
        System.out.println(myDate);



        // Problem 5

        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(6);
        hs.add(8);
        hs.add(9);
        hs.add(10);
        hs.add(10);
        hs.add(11);
        System.out.println(hs);


    }
}
