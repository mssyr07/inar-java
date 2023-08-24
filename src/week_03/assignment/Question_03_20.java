package week_03.assignment;

import java.util.Scanner;

public class Question_03_20 {                                                                                                       //////////////////
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the tempeerature in Fahrenheit between -58F and 41F : ");
        int temperature = input.nextInt();

        System.out.println("Enter the wind speed ( >=2 ) in miles per hour :  ");
        int windSpeed = input.nextInt();

        double windChillIndex = (35.74 + (0.6215 * temperature)) - (35.75 * (Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * (Math.pow(windSpeed, 0.16))));

        if ((temperature < -58 || temperature > 41)) {
            System.out.println("The temperature is invalid");

        } else if (windSpeed < 2) {
            System.out.println("The windspeed is invalid");

        } else {
            System.out.println("The wind chill index is : " + windChillIndex);
        }

    }
}
