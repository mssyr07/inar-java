package week_03;
import java.util.Scanner;
public class Question_03_08 {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        if (a >= b ) {

            if ( b > c ) {
                System.out.println( c + " < " + b + " < " + a );
            }

            else if ( c >= a) {

                System.out.println( b + " < " + a + " < " + c );
            }
            else if ( a > c ){
                System.out.println( b + " < " + c + " < " + a );
            }
        }

        if (b > a) {

            if  (c >=b) {
                System.out.println( a + " < " + b + " < " + c);
            }
            else if (c >= a ) {
                System.out.println( a + " < " + c + " < " + b  );

            }
            else if ( a > c ){
                System.out.println( c + " < " + a + " < " + b);
            }
        }



    }
}
