import java.util.Arrays;
import java.util.List;

public class SumofOdds {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 3, 5, 8, 9, 14, 17, 21, 4, 6);

        int sumOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)      // Filter odd numbers
                .mapToInt(Integer::intValue)  // Convert to IntStream
                .sum();                       // Sum the values

        int sumOfOdds2 = numbers.stream().filter(n -> n % 2 == 0).
                reduce(0, Integer::sum);
        System.out.println("Sum of odd integers: " + sumOfOdds2);
        System.out.println("Sum of odd integers: " + sumOfOdds);
    }
}
