package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = getTheMatrix(3, 4);

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at " + i + " is " + sumOfColumns(matrix, i));

        }
    }

    public static double[][] getTheMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row : ");
        double[][] matrix = new double[row][column];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;


    }

    public static double sumOfColumns(double[][] array, int column) {
        double total = 0;
        for (int j = 0; j < array.length; j++) {
            total += array[j][column];
        }
        return total;
    }


}





