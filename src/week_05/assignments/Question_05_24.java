package week_05.assignments;

public class Question_05_24 {
    public static void main(String[] args) {

        double sum = 0.0 ;
        for(double n = 1.0; n <= 97.0 ; n+=2.0){

            sum += n / (n + 2);
        }
        System.out.println("The result is : " + sum);
    }
}

