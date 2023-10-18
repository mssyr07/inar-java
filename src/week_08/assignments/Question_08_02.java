package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[][] matrix = getMatrix(4, 4);

        System.out.println("Sum of the element on the major diagonal is " + sumMajorDiagonal(matrix));


    }

    public static double[][] getMatrix(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row :  ");
        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;

    }

    public static double sumMajorDiagonal(double[][] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        return total;
    }
}
