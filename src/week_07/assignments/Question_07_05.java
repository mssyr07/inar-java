package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int num ;
        int counter = 0 ;

        System.out.println("Enter 10 numbers : ");
        for(int i = 0 ; i < 10 ; i++){
            num = input.nextInt();

            if(isDistinct(numbers , num)){
                numbers[counter] = num;
                counter++;
            }
        }

        System.out.println("The number of distinct number is " + " " + counter);
        System.out.print("The distinct numbers are " + " "  );

        for(int i= 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                System.out.print(" " + numbers[i]);

            }
        }

    }
    public static boolean isDistinct(int[]array , int num){
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return false;
            }

        }return true ;
    }
}
