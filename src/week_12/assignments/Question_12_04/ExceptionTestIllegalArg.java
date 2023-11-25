package week_12.assignments.Question_12_04;

public class ExceptionTestIllegalArg {
    public static void main(String[] args) {

       try {
           Loan loan = new Loan(7,11,-1);
       }
       catch (java.lang.IllegalArgumentException ex){
           System.out.println("Wrong input! Please greater than 0 (zero)");
       }
    }
}
