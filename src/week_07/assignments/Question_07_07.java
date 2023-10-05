package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int [] randomDigitNumbers = new int[10];

        for(int i = 0 ; i < 100; i++){
            int number = (int) (Math.random() * 10) ;
            randomDigitNumbers[number]++;


        }
        for(int i = 0; i < randomDigitNumbers.length; i++){
            System.out.println(i + " s: " + randomDigitNumbers[i]);
        }
    }
}
