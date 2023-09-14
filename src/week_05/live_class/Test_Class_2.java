package week_05.live_class;

import java.util.Scanner;

public class Test_Class_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int originalNumber;
        int remainder;
        int result = 0;

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        originalNumber = number;

        while(originalNumber != 0){
            remainder = originalNumber % 10;
            result += Math.pow(remainder , 3);
            originalNumber /= 10;
        }
        if(result == number){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");

        }
    }
}
