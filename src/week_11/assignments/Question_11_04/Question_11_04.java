package week_11.assignments.Question_11_04;


import java.util.Scanner;
import java.util.ArrayList;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a sequence of numbers ending with 0 : ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }


        System.out.print("The largest number int he list is : " + max(list));


    }
    public static Integer max(ArrayList<Integer> list){
        if (list.size() == 0){
            return null;
        }

        Integer max = list.get(0);
        for (int i = 0; i < list.size();i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

}
