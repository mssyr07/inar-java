package week_03.assignment;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y- coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ( (x >= 0 && x <= 200) && (y >=0 && y <= 100)){
            System.out.println("The point is in the triangle ");
        }else{
            System.out.println(("Sorry . The point is not in the triangle "));
        }
    }
}
