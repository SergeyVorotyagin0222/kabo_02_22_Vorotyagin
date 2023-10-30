package mirea.pr11;

import java.util.*;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("year>> ");
        int year = scanner.nextInt();
        System.out.println("month>> ");
        int month = scanner.nextInt();
        month--;
        System.out.println("day>> ");
        int day = scanner.nextInt();
        System.out.println("hour>> ");
        int hour = scanner.nextInt();
        System.out.println("minutes>> ");
        int min = scanner.nextInt();
        System.out.println("secunds>> ");
        int sec = scanner.nextInt();

        Date date = new Date(year - 1900, month, day, hour, min, sec);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, min, sec);

        System.out.println("Date object>> \n" + date);
        System.out.println("Calendar object>> \n" + calendar.getTime());

    }
}