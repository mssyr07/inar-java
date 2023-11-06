package week_09.assignments;

import java.util.Scanner;

public class LocationTest_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows and columns :");
        int numberOfRows = input.nextInt();

        int numberOfColumns = input.nextInt();
        

        double[][] numbers = new double[numberOfRows][numberOfColumns];


        System.out.println("Enter the array : ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        Location_09_13 location = Location_09_13.locateLargest(numbers);

        System.out.println("The location of the largest element is  " + location.maxValue + " at ( " + location.maxRow + " , " + location.maxColumn + " )");

    }
}
