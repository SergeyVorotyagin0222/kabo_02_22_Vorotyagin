package mirea.pr8;
import java.util.Scanner;
//6. Задание Проверка числа на простоту
//        Дано натуральное число n>1. Проверьте, является ли оно простым.
//        Программа должна вывести слово YES, если число простое и NO, если число
//        составное. Алгоритм должен иметь сложность O(logn).

public class Task1 {
    public static int recursion (int a){
        if (a == 1 || a == 2){
            return 1;
        }
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter >> ");
        x = scanner.nextInt();
        if (recursion(x) == 1){
            System.out.println("YES");
        }
        if (recursion(x) == 0){
            System.out.println("NO");
        }

    }

}
