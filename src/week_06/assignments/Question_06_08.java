package week_06.assignments;

import java.sql.SQLOutput;

public class Question_06_08 {
    public static void main(String[] args) {


        System.out.println(" Celcius         Fahrenheit     |       Fahrenheit      Celcius  ");
        System.out.println(" ________________________________________________________________");

        for (double celcius = 40.0, fahrenheit = 120.0; celcius >= 31.0; celcius--, fahrenheit -= 10) {

            System.out.println(celcius + "                   " + celciusToFahrenheit(celcius) + "    |       " + fahrenheit + "           " + fahrenheitToCelcius(fahrenheit));

        }
    }

    public static double celciusToFahrenheit(double celcius) {
        return (9.0 / 5) * celcius + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
