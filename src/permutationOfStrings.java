// Java Program to generate all unique
// permutations of a string
import java.util.*;

class permutationOfStrings {

    // Recursive function to generate 
    // all permutations of string s
    static void recurPermute(int index, StringBuilder s,
                             List<String> ans) {

        // Base Case
        if (index == s.length()) {
            ans.add(s.toString());
            return;
        }

        // Swap the current index with all
        // possible indices and recur
        for (int i = index; i < s.length(); i++) {
            swap(s, index, i);
            recurPermute(index + 1, s, ans);
            swap(s, index, i);
        }
    }

    // Swap characters at positions i and j
    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    // Function to find all unique permutations
    static List<String> findPermutation(String s) {

        // Stores the final answer
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);

        recurPermute(0, str, ans);

        // sort the resultant list
        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        String s = "ABC";
        List<String> res = findPermutation(s);
        for (String x : res) {
            System.out.print(x + " ");
        }
    }
}