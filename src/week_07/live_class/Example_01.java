package week_07.live_class;

public class Example_01 {
    public static void main(String[] args) {
        int []numbers1 = {10 , 3 , 5, 6 };
        int dif = bigDiff(numbers1);
        System.out.println(dif);


        int []numbers2 = {7 , 2 , 10, 9 };
         dif = bigDiff(numbers2);
        System.out.println(dif);


        int []numbers3 = {2 , 10 , 7 , 2 };
         dif = bigDiff(numbers3);
        System.out.println(dif);


    }

    public static int bigDiff(int[]numbers){
        int max = numbers[0];
        int min = numbers[0];
        for(int i = 1 ; i < numbers.length;i++){
            if (numbers[i] < min){
                min = numbers[i];
            }

            if (numbers[i] > max){
                max = numbers[i];

            }
    } return max - min;
}}
