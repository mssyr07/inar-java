package week_10.assignments;

import java.sql.SQLOutput;

public class QueueTest_10_10 {
    public static void main(String[] args) {

        Queue_10_10 queue = new Queue_10_10();

        for (int i = 1; i <= 20; i++) {
            queue.enque(i);
            System.out.print(i + " ");
        }

        System.out.println("\n\nProcess of Deque : ");
        while (!queue.empty()) {
            System.out.print(queue.deque() + " ");
        }
    }
}
