import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class stream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "apple");
        System.out.println(strings);
        Map<String, Integer> stringLengthMap = strings.stream()
                .collect(Collectors.toMap(
                        s -> s.toUpperCase(), // Key: the string itself
                        String::length, // Value: the length of the string
                        (existingValue, newValue) -> newValue // Handle duplicates (if needed, otherwise can be omitted)
                ));
        System.out.println(stringLengthMap);

        List<String> names = Arrays.asList("john", "mary", "peter");
        names.stream()
                .map(String::toUpperCase) // Method reference to convert to uppercase
                .forEach(System.out::println);

        Map<String, Cricketer> hashmap = new Hashtable<String, Cricketer>();
        hashmap.put("sachin", new Cricketer("Sachin", 14000));
        hashmap.put("dravid", new Cricketer("Dravid", 12000));
        System.out.println(hashmap.get("sachin"));
        System.out.println(hashmap.get("dravid"));
    }
}