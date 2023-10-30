package mirea.pr11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        currentDate.setTime((currentDate.getTime() / 1000) * 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentDate = dateFormat.format(currentDate);

        System.out.println("Now is>> " + formattedCurrentDate);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date/time (dd-MM-yyyy HH:mm:ss)>>  ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            Date userDate = dateFormat.parse(userInput);
            if (userDate.before(currentDate)) {
                System.out.println("Before");
            } else if (userDate.after(currentDate)) {
                System.out.println("After");
            } else {
                System.out.println("Its now");
            }
        } catch (Exception e) {
            System.err.println("Wrong format");
        }
    }
}