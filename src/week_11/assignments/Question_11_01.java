package week_11.assignments;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 , side 2 , side3 : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();


        System.out.print("Enter color : ");
        String color = input.next();

        System.out.println("Is the triangle filled ? (True / False ) : ");
        boolean filled = input.nextBoolean();

        Triangle_11_01 triangle = new Triangle_11_01(side1, side2, side3);

        triangle.setColor(color);
        triangle.setFilled(filled);


        System.out.println(triangle.toString());
        System.out.println("Area        : " + triangle.getArea());
        System.out.println("Perimeter   : " + triangle.getPerimeter());
        System.out.println("Color       : " + triangle.getColor());
        System.out.println("Triangle is : " + (triangle.isFilled() ? "" : "not") + "filled");


    }
}
