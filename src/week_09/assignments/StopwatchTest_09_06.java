package week_09.assignments;

import java.util.jar.JarEntry;

public class StopwatchTest_09_06 {
    public static void main(String[] args) {

        Stopwatch_09_06 stopWatch = new Stopwatch_09_06();


        // creates and fills a one-dimensional array to sort //
        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100_000);

        }
        System.out.println("1");


        // starts the watch //
        stopWatch.start();
        System.out.println("2");


        // starts to sort the array with selection sort //

        selectionSort(array);
        System.out.println("3");


        // stops the watch //

        stopWatch.stop();
        System.out.println("4");


        System.out.println("The execution time of sorting 100,000 numbers using Selection Sort : " + stopWatch.getElapsedTime() + " milliseconds ");



    }


    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minNumber = array[i];
            int minIndex = i;


            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minNumber) {
                    minNumber = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = minNumber;
            }
        }
    }
}
