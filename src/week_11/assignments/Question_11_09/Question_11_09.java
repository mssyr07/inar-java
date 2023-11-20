package week_11.assignments.Question_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {

        int[][] matrix = getMatrix();
        prinMatrix(matrix);
        ArrayList<Integer> largestRow = getLargestRow(matrix);
        ArrayList<Integer> largestColumn = getLargestColumn(matrix);
        System.out.print("The largest row index: ");
        printArrayList(largestRow);
        System.out.print("\nThe largest column index: ");
        printArrayList(largestColumn);


    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void prinMatrix(int[][] array) {
        System.out.println("The Array : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> getLargestRow(int[][] array) {
        ArrayList<Integer> largestRow = new ArrayList<>();
        int maxOneRow = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; i++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOneRow) {
                maxOneRow = count;
                largestRow.clear();
                largestRow.add(i);
            } else if (count == maxOneRow) {
                largestRow.add(i);

            }
        }
        return largestRow;

    }

    public static ArrayList<Integer> getLargestColumn(int[][] array) {
        ArrayList<Integer> largestColumn = new ArrayList<>();
        int maxOneColumn = 0;

        for (int j = 0; j < array[0].length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOneColumn) {
                maxOneColumn = count;
                largestColumn.clear();
                largestColumn.add(j);
            } else if (count == maxOneColumn) {
                largestColumn.add(j);

            }
        }
        return largestColumn;

    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
