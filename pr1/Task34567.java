package mirea.pr1;

import java.util.*;

public class Task34567 {
    // 1 practic


    public static void main(String[] args){
        // 3
        int[] a = new int[10];
        int sum = 0, avg = 0;
        for (int i = 0; i <10; i++){
            a[i] += i + 1;
            System.out.println(a[i]);
            sum += a[i];
        }
        avg = sum/a.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        //4
        int[] b = new int [20];
        int i = 0;
        sum = 0;
        while (i < 10){
            Scanner in = new Scanner (System.in);
            int g = in.nextInt();
            b[i] = g;
            i++;
            sum += g;
        }
        int mn = b[0], mx = b[0];
        for (int g = 0; g < 10; g++){
            if (mx < b[g]){
                mx = b[g];
            }
            if (mn > b[g]){
                mn = b[g];
            }
        }
        System.out.println("sum" + sum);
        System.out.println("min" + mn);
        System.out.println("max" + mx);

        //5
        System.out.println("args:" + args.length);

        //6
        for ( i = 0; i<11; i++){
            System.out.println("1/" + i);
        }

        //7
        int ak = 7, bk = 1;
        while (ak > 1){
            bk *= ak;
            ak--;
        }
        System.out.println(bk);
    }
}

