package week_11.assignments.Question_11_14;
import java.util.Scanner;
import java.util.ArrayList;

public class Question_11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = getList();
        ArrayList<Integer> list2 = getList();
        ArrayList<Integer> unionList = union(list1,list2);

        System.out.println("The combined list is : " + unionList);

    }

    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list with five integers : ");

        for (int i = 0; i < 5; i++){
            int number = input.nextInt();
            list.add(number);
        }

        return list;

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1 , ArrayList<Integer> list2){
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }

}
