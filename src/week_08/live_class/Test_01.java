package week_08.live_class;

public class Test_01 {
    public static void main(String[] args) {

        int[] repetations = new int[10];

        displayRepeats(repetations);

        System.out.println("Count for each number between 0 and 9 : ");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "s:" + repetations[i]);

        }
    }

    public static void displayRepeats(int[] array) {

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            array[number]++;


        }

    }
}
