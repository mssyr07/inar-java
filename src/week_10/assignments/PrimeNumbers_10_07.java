package week_10.assignments;

public class PrimeNumbers_10_07 {
    public static void main(String[] args) {

        StackOfIntegers_10_05 stackOfIntegers = new StackOfIntegers_10_05();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }

        while (!stackOfIntegers.isEmpty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }

    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }

        }
        return true;
    }
}
