package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1 : ");

        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();


            }
        }


        System.out.print("Enter matrix2 : ");

        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        double[][] addedMatrix = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows : ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.println(matrix1[i][j]);
                if (i == 1 && j == 2) {
                    System.out.print(" + ");
                } else if (i != 1 && j == 2) {
                    System.out.print("    ");
                }
            }

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.println(matrix2[i][j]);
                if (i == 1 && j == 2) {
                    System.out.print(" + ");
                } else if (i != 1 && j == 2) {
                    System.out.print("    ");
                }
            }


            for (int j = 0; j < addedMatrix[i].length; j++) {

                System.out.println(matrix2[i][j]);

                if (i != 1 && j == 2) {
                    System.out.print("    ");
                }
            }
        }


    }


    public static double[][] addMatrix(double[][] array1, double[][] array2) {
        double[][] newMatrix = new double[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {

                newMatrix[i][j] = array1[i][j] + array2[i][j];

            }
        }
        return newMatrix;
    }
}
