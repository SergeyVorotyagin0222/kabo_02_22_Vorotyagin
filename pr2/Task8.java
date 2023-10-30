package mirea.pr2;

public class Task8 {

    public static void main(String[] args) {

        //2.8
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            int q = a.length - i - 1;
            int z = a[q];
            a[q] = a[i];
            a[i] = z;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

}

