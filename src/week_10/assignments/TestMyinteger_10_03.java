package week_10.assignments;

public class TestMyinteger_10_03 {
    public static void main(String[] args) {
        // Create an array of test values
        int[] values = {5, 6, 7, 8, 9};

        // Test isEven(int), isOdd(int), and isPrime(int)
        System.out.println("\nTest if values are even using isEven(int):");
        for (int Myinteger_10_03 = 0; Myinteger_10_03 < values.length; Myinteger_10_03++) {
            System.out.println(values[Myinteger_10_03] + " " + Myinteger_10_03.isEven(values[Myinteger_10_03]));
        }

        System.out.println("\nTest if values are odd using isOdd(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + i.isOdd(values[i]));
        }

        System.out.println("\nTest if values are prime using isPrime(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + i.isPrime(values[i]));
        }

        // Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
        System.out.println("\nTest if values are even using isEven():");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven());
        }

        System.out.println("\nTest if values are odd using isOdd():");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd());
        }

        System.out.println("\nTest if values are prime using isPrime():");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }

        // Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
        System.out.println("\nTest if values are even using isEven(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + i.isEven(value));
        }

        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + i.isOdd(value));
        }

        System.out.println("\nTest if values are prime using isPrime(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + i.isPrime(value));
        }

        // Test equals(int) and equals(MyInteger)
        int[] values2 = {5, 9, 7};
        MyInteger value = new MyInteger(9);
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i] + " " + value.equals(values2[i]));
        }

        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values2.length; i++) {
            MyInteger_10_03 myInteger = new MyInteger_10_03((values2[i]);
            System.out.println(values2[i] + " " + value.equals(myInteger));
        }

        // Test parseInt(char[]) and parseInt(String)
        System.out.println("\nTest parseInt(char[]) and parseInt(String):");
        // Create a character array
        char[] numericCharacters = {'3', '4', '2'};

        // Create a string
        String numericString = "658";
        System.out.print("\'");
        for (int i = 0; i < numericCharacters.length; i++) {
            System.out.print(numericCharacters[i] + "");
        }
        System.out.println("\' + \"" + numericString + "\" = " +
                (i.parseInt(numericCharacters) +
                        i.parseInt(numericString)));
    }
}
