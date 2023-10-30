package mirea.pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static void main(String[] args) {
        System.out.println("Enter Email>> ");

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Right!");
            } else{
                System.out.println("Wrong");

            }
        }
    }
}