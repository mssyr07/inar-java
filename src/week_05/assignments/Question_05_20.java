package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {

        int number;
        int numberOfRepeat = 0;

        for (int i = 2; i <= 1000; i++) {
            number = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) number++;
            }
            if (number == 0) {
                System.out.print(i + " ");
                numberOfRepeat++;
                if (numberOfRepeat == 8) {
                    System.out.println();
                    numberOfRepeat = 0;
                }
            }
        }

    }
}
