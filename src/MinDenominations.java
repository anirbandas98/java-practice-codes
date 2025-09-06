/******************************************************************************

 Given a string s representing a Roman numeral, find it's corresponding integer value.
 Roman numerals are formed using the following symbols: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, and M = 1000
 s= "VII"
 output = 7
 s = "XIX"
 output = 19

 *******************************************************************************/

import java.util.*;

public class MinDenominations {

    public static List<Integer> findMinDenominations(int total, List<Integer> denominations) {
        // Sort in descending order
        denominations.sort(Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();
        for (int deno : denominations) {
            while (total >= deno) {
                result.add(deno);
                total -= deno;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> deno = Arrays.asList(1, 2, 5, 10, 20, 50, 100);
        int totalAmount = 93;

        List<Integer> output = findMinDenominations(totalAmount, new ArrayList<>(deno));
        System.out.println(output);
    }
}
