package mirea.pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {
        System.out.println("Enter date (dd/mm/yyyy >>");

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$");

        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Right");
            } else{
                System.out.println("Wrong");

            }
        }
    }
}