package week_09.assignments;


public class Random_09_04 {
    public static void main(String[] args) {

        //Also could be imported upwards instead of this //
        java.util.Random random = new java.util.Random(1000);

        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(random.nextInt(100) + " ");
        }
    }
}
