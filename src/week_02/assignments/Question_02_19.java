package week_02.assignments;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Question_02_19 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println(" Entter x1 and y1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();


        System.out.println(" Entter x2 and y2 : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        System.out.println(" Entter x3 and y3 : ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        double side1 = Math.pow((Math.pow((x1-x2),2) + Math.pow((y1-y2), 2)), 0.5) ;
        double side2 = Math.pow((Math.pow((x1-x3),2) + Math.pow((y1-y3), 2)), 0.5) ;
        double side3 = Math.pow((Math.pow((x3-x2),2) + Math.pow((y3-y2), 2)), 0.5) ;


        double s = ( side1 + side2 + side3 ) / 2 ;

        double area = Math.pow((s - side1) * (s - side2) * (s - side3) , 0.5) ;

        System.out.println( "The area of the triangle is : " +(int)(area * 10) /10.0);



    }
}
