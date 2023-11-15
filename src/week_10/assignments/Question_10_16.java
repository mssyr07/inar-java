package week_10.assignments;

import com.sun.source.tree.WhileLoopTree;
import week_10.live_class.Computer;
                                                                                /////
import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {

        int count = 0;

        BigInteger a = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger b = new BigInteger("0");

        while (count < 10 ){
            if (b.compareTo(a.remainder(new BigInteger("2"))) == 0 || b.compareTo(a.remainder(new BigInteger("3"))) == 0 ) {
                System.out.println(a);
                count++;
            }
            a = a.add(new BigInteger("1"));
        }

    }
}
