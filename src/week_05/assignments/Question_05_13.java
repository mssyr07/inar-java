package week_05.assignments;

public class Question_05_13 {
    public static void main(String[] args) {


        int n = 1;

        while(Math.pow(n , 3) < 12000 ){
            if(Math.pow((n+1) , 3) >12000){
                break;

            }else{
                n++;
            }
        }

        System.out.println("The largest n is : " + n);
    }
}
