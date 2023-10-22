package week_08.assignments;

import java.util.Arrays;

public class Question_08_04 {
    public static void main(String[] args) {

        int[][] weeklyLaborHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},};

        int[][] sumHours = new int[8][2];

        for (int i = 0; i < weeklyLaborHours.length; i++) {
            for (int j = 0; j < weeklyLaborHours[i].length; j++) {
                sumHours[i][0] += weeklyLaborHours[i][j];
            }
            sumHours[i][1] = i;
        }


        //Sorting the Array by Selection Sort //

        for (int i = 0; i < sumHours.length - 1; i++) {
            for (int j = i + 1 ; j < sumHours.length; j++) {
                if (sumHours[i][0] < sumHours[j][0]) {
                    int[] temp = sumHours[i];
                    sumHours[i] = sumHours[j];
                    sumHours[j] = temp;

                }
            }
        }

        for (int i = 0; i < sumHours.length; i++) {
            System.out.print("Employee " + sumHours[i][1] + "'s total work hour is : ");
            System.out.print(sumHours[i][0] + "\n");
        }
    }


}

