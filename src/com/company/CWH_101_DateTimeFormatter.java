package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String MyDate =dt.format(df); // Creating date String using date and format
        System.out.println(MyDate);

        DateTimeFormatter df2= DateTimeFormatter.ofPattern("dd-MM-YYYY----E");
        String MyDate2 =dt.format(df2); // Creating date String using date and format
        System.out.println(MyDate2);

    }
}
