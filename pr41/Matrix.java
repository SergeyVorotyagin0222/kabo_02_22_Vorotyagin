package mirea.pr41;

public class Matrix {

    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public void fillMatrix(double[][] values){
        if (values.length != rows || values[0].length != columns){
            throw new IllegalArgumentException("Bad sizes");
        }
        this.matrix = values;
    }

    public Matrix add(Matrix  anotherMatrix){
        if (this.rows != anotherMatrix.rows || this.columns != anotherMatrix.columns){
            throw new IllegalArgumentException("different sizes");
        }
        Matrix resultMatrix = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                resultMatrix.matrix[i][j] = this.matrix[i][j] + anotherMatrix.matrix[i][j];
            }
        }
        return resultMatrix;
    }

    public Matrix multiplyByNumper(double number){
        Matrix resultMatrix = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                resultMatrix.matrix[i][j] = this.matrix[i][j]*number;
            }
        }
        return resultMatrix;
    }

    public void printMatrix(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
