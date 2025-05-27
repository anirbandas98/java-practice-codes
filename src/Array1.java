import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array1 {

    static List<String> sorted(List<String> strings)
    {
        strings.sort(Collections.reverseOrder());
        return strings;
    }
    static boolean areAnagrams(String s1, String s2) {

        // Sort both strings
        char[] s1Array = s1.toCharArray();
        System.out.println(s1Array);
        char[] s2Array = s2.toCharArray();
        System.out.println(s2Array);
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }
    static int remAnagrams(String s1, String s2) {
        // add code here.
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        // count frequency of each character in first string
        for (char ch : s1.toCharArray()) {
            cnt1[ch - 'a']++;
        }

        // count frequency of each character in second string
        for (char ch : s2.toCharArray()) {
            cnt2[ch - 'a']++;
        }

        // traverse count arrays to find number of characters
        // to be removed
        int ans = 0;

        for (int i = 0; i < 26; i++)
            ans += Math.abs(cnt1[i] - cnt2[i]);

        return ans;
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        System.out.println(sorted(strings));
        String s1 = "geeks";
        String s2 = "kskseeg";
        System.out.println(areAnagrams(s1, s2));
        System.out.println(remAnagrams(s1, s2));
    }
}
