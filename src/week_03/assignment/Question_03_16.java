package week_03.assignment;
import java.util.Scanner;

public class Question_03_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int randomWidth = (int) (Math.random() * 201) - 100;
        int randomHeight = (int) (Math.random() * 301) - 100;

        System.out.println("Random coordinate in rectangle centered at ( 0 , 0 ) with width 100 and height 200 : " + " ( " + randomWidth + " , " + randomHeight + " ) ");

    }
}
