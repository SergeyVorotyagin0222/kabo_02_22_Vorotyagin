package mirea.pr11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String name = "Sergey";

        Date assignmentReceivedDate = new Date();
        long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

        long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000;
        Date assignmentDueDate = new Date(assignmentDueTimeMillis);

        System.out.println("Name>> " + name);
        System.out.println("work recieved : " + assignmentReceivedDate);
        System.out.println("work done : " + assignmentDueDate);
    }

    public static class Task4 {
    }
}
