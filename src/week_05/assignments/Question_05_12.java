package week_05.assignments;

public class Question_05_12 {
    public static void main(String[] args) {

        int i = 1;
        int n = 0;
        double checkInt = 0;
        while ((checkInt = Math.pow(i, 2)) < 12000) {
            n = i;
            i++;
        }
        System.out.println("The smallest n is " + (n+1));

    }
}
