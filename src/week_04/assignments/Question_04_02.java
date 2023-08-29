package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter 1st point (latitude and longtitude) in degrees :");

        double latitude1 = input.nextDouble();
        double longtitude1 = input.nextDouble();

        System.out.println(" Enter 2nd point (latitude and longtitude) in degrees : ");

        double latitude2 = input.nextDouble();
        double longtitude2 = input.nextDouble();

        final double RADIUS = 6371.01;

        double distance = RADIUS * Math.acos(Math.sin(Math.toRadians(latitude1)) *
                Math.sin(Math.toRadians(latitude2)) + Math.cos(Math.toRadians(latitude1))
                * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(longtitude1) - Math.toRadians(longtitude2)));

        System.out.println("the distance between the two points is " + distance + " km");
    }
}
