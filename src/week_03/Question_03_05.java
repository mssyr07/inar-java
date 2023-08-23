package week_03;
import java.util.Scanner;

public class Question_03_05 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day : ");
        int today = input.nextInt();

        System.out.println("Enter the nuber of days elapsed since today : ");
        int elapsedDay = input.nextInt();

        int exactDay = (today + elapsedDay) % 7  ;
        String day = null ;

        switch (exactDay) {

            case 0 :  day = "Sunday" ;   break ;
            case 1 :  day = "Monday" ;   break ;
            case 2 :  day = "Tuesday" ;  break ;
            case 3 :  day = "Wednesday" ; break ;
            case 4 :  day = "Thursday" ; break ;
            case 5 :  day = "Friday" ;   break ;
            case 6 :  day = "Saturday" ; break ;


        }


        switch (today) {

            case 0 :
                System.out.println("Today is Sunday and the future day is " + day); break ;

            case 1 :
                System.out.println("Today is Monday and the future day is  " + day); break ;

            case 2 :
                System.out.println("Today is Tuesday and the future day is " + day); break ;

            case 3 :
                System.out.println("Today is Wednesday and the future day is " + day); break ;

            case 4 :
                System.out.println("Today is Thursday and the future day is " + day); break ;

            case 5 :
                System.out.println("Today is Friday and the future day is " + day); break ;

            case 6 :
                System.out.println("Today is Saturday and the future day is " + day); break ;
        }

    }
}
