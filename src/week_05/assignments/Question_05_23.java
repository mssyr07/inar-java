package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double checkSumLeftToRight = 0.0;
        double checkSumRightToLeft = 0.0;
        for(int i = 1; i <= 50000 ; i++){
            checkSumLeftToRight += 1.0 / i ;
        }
        System.out.println("The summation of the series left to right : " + checkSumLeftToRight) ;
        for (int i = 50000; i >= 1 ; i--){
            checkSumRightToLeft += 1.0 / i;
        }
        System.out.println(" The summation of the  right to left  : " + checkSumRightToLeft) ;

        System.out.println("The summation of both : " + checkSumLeftToRight + checkSumRightToLeft  );
    }

}
