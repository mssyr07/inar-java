package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        System.out.println("All the leap years from 101 to 2100:");
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            // Test for leap year
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                count++;
                // Ten results per line separated by exactly one space
                System.out.print(year + (count % 10 == 0 ? "\n" : " "));
            }
        }
        System.out.println();
    }
}
