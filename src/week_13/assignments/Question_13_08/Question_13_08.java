package week_13.assignments.Question_13_08;

import java.sql.SQLOutput;

public class Question_13_08 {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyStack stack1 = new MyStack();

        System.out.println("Pushing numbers 2 , 3 and 4 ");

        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println("Just cloning .. ");

        MyStack stack2 = (MyStack) (stack1.clone());

        System.out.println("Popping object from 1st ..");

        stack1.pop();

        System.out.println("Popping object from 2nd .. ");

        stack2.pop();

        System.out.println("1st " + stack1);
        System.out.println("2nd " + stack2);

        System.out.println("Are those stacks equal ? : " + (stack1 == stack2));

    }
}
