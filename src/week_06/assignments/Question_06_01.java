package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {

        int numberOfNumbers = 100;
        int numberForPerLine = 0;

        System.out.println("The first 100 pentagonal numbers , ten per line :");

        for (int i = 1; i <= numberOfNumbers; i++) {
            if (numberForPerLine % 10 == 0) {
                System.out.println();
            }
            System.out.print(getPentagonalNumbers(i) + " ");
            numberForPerLine++;
        }


    }

    public static int getPentagonalNumbers(int n) {
        return (n * (3 * n - 1)) / 2;

    }
}
