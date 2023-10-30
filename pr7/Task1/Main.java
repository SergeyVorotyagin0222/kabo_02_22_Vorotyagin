package mirea.pr7.Task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int x;
        int y;
        String move;
        System.out.println("start coords: ");
        System.out.println("X >> ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Y >> ");
        y = scanner.nextInt();
        MovableRectangle rect = new MovableRectangle(x, y);

        boolean exit = true;

        while (exit) {
            System.out.println("up/down/left/right/exit");
            move = scanner.next().toLowerCase();
            switch (move){
                case ("up"):
                    rect.moveUp();
                    System.out.println(rect.toString());
                    break;
                case ("down"):
                    rect.moveDown();
                    System.out.println(rect.toString());
                    break;
                case ("left"):
                    rect.moveLeft();
                    System.out.println(rect.toString());
                    break;
                case ("right"):
                    rect.moveRight();
                    System.out.println(rect.toString());
                    break;
                case ("exit"):
                    System.out.println("stop");
                    System.out.println(rect.toString());
                    exit = false;
                    break;
                default:
                    System.out.println("check out >> ");
                    break;
            }
        }

    }
}
