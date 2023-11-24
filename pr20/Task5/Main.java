package mirea.pr20.Task5;

public class Main {
    public static void main(String[] args) {
        Integer[][] data1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Integer[][] data2 = { { 1, 2, 3 }, { 5, 7, 11 }, { 13, 17, 19 } };

        Matrix<Integer> matrix1 = new Matrix<>(3, 3, data1);
        Matrix<Integer> matrix2 = new Matrix<>(3, 3, data2);

        System.out.println("Matrix 1>> ");
        matrix1.printMatrix();

        System.out.println("Matrix 2>> ");
        matrix2.printMatrix();

        System.out.println("Summ>> ");
        matrix1.add(matrix2).printMatrix();

        System.out.println("Multy>> ");
        matrix1.multiply(matrix2).printMatrix();
    }
}
