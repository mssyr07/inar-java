package week_05.assignments;
import java.util.Scanner;


public class Question_05_03 {
    public static void main(String[] args) {


        System. out.println("Kilograms                  Pounds ");

        for(int i = 1; i < 200 ; i=i+2){
            System.out.println(i + "                          " + (((int)(i * 2.2) * 100)/100.0));
        }

    }
}



