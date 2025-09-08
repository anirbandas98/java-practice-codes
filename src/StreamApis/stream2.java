package StreamApis;

import java.util.Arrays;

public class stream2 {
    public static void main(String[] args) {
        String s = "I am here for an interview";

        Arrays.stream(s.split(" "))
                .forEach(System.out::println);
//                .map(x -> x.equals("am");

        //System.out.println(s1);
    }
}
