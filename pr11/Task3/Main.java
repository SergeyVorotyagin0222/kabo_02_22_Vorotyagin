package mirea.pr11.Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("st1", new Date(2104 - 2000, 0, 22)); // Пример даты рождения: 2000-01-01

        System.out.println("dd/MM/yy >> " + student.getFormattedDate("dd/MM/yy"));
        System.out.println("dd/MM/yyyy >> " + student.getFormattedDate("dd/MM/yyyy"));
        System.out.println("dd Month yyyy >> " + student.getFormattedDate("dd MMMM yyyy"));
    }
}