package week_10.assignments;

import java.util.Scanner;

public class StackOfIntegersTest_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StackOfIntegers_10_05 stackOfIntegers = new StackOfIntegers_10_05();

        System.out.print("Enter a positive Integer : ");
        int number = input.nextInt();

        System.out.print("Decreasing order : ");

        smallestFactor(number, stackOfIntegers);

        System.out.print("We used pop() : ");
        popped(number,stackOfIntegers);




        }

        public static void popped(int number , StackOfIntegers_10_05 stackOfIntegers){
            while (!stackOfIntegers.isEmpty()) {
                System.out.print(stackOfIntegers.pop() + " ");
        }


    }

    public static void smallestFactor(int number, StackOfIntegers_10_05 stackOfIntegers) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stackOfIntegers.push(i);
                number /= i;
            } else
                i++;
        }
        stackOfIntegers.push(number);
    }
}

