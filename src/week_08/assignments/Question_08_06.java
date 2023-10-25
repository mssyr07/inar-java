package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix 1 : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = input.nextDouble();

            }
        }


        System.out.print("Enter matrix 2 : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = input.nextDouble();

            }
        }


        double[][] finalMatrix = resultMatrix(matrix1, matrix2);
        displayResultMatrix(matrix1, matrix2, finalMatrix);


    }

    public static double[][] resultMatrix(double[][] array1, double[][] array2) {

        double[][] newMatrix = new double[3][3];

        for (int row = 0; row < newMatrix.length; row++) {
            for (int column = 0; column < newMatrix[row].length; column++) {

                newMatrix[row][column] = (array1[row][0] * array2[0][column]) + (array1[row][1] * array2[1][column]) + (array1[row][2] * array2[2][column]);
            }
        }
        return newMatrix;
    }


    public static void displayResultMatrix(double[][] array1, double[][] array2, double[][] array3) {
        System.out.println("The multiplication of matrices is : ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {

                System.out.printf("%-5.1f", array1[i][j]);

            }
            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfMatrix2 = 0; columnOfMatrix2 < array2[i].length; columnOfMatrix2++) {
                System.out.printf("%-4.1f ", array2[i][columnOfMatrix2]);
            }
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfSum = 0; columnOfSum < array3[i].length; columnOfSum++) {
                System.out.printf("%-5.1f ", array3[i][columnOfSum]);
            }
            System.out.println();
        }

    }


}
