import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dmitry.kalmetyev on 23/06/2014.
 */
public class Exercise65 {

    public static void main(String[] args) {
        List <Integer> digits;
        int input = 456;
        digits = sliceToDigits(input);
        int sumOfDigits=0;
        for (Integer digit : digits) {
            sumOfDigits += digit;
        }

        if (Math.pow(input,2) == Math.pow(sumOfDigits,3)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }

    private static List sliceToDigits(int x) {
        List <Integer> digits = new ArrayList<Integer>();
        do {
            digits.add(x % 10);
            x = x / 10;
        } while (x>0);

        return digits;
    }
}
