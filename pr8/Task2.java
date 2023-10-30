package mirea.pr8;

import java.util.Scanner;

//7. Задание Разложение на множители
//        Дано натуральное число n>1. Выведите все простые множители этого
//        числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
//        сложность O(logn)

public class Task2 {
    public static int recursion(int a) {
        for (int i = 1; i < a; i++){
            if (a%i==0){
                System.out.println(i);
            }
        }
        return 1;
    }
    public static void main (String[] args){
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter >> ");
        x = scanner.nextInt();
        System.out.println(recursion(x));
    }
}