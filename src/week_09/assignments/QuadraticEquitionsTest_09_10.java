package week_09.assignments;

import java.util.Scanner;

public class QuadraticEquitionsTest_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a , b , c : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquitions_09_10 equition = new QuadraticEquitions_09_10(a, b, c);


        System.out.print("The equation has  ");
        if (equition.getDiscrimainant() > 0) {
            System.out.println("two roots : " + equition.getRoot1() + " and " + equition.getRoot2());
        } else if (equition.getDiscrimainant() < 0) {
            System.out.println(" no real roots ");

        } else System.out.println(" one root " + (equition.getRoot1() > 0 ? equition.getRoot1() : equition.getRoot2()));

    }
}
