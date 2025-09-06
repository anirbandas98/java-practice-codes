import java.util.ArrayList;
import java.util.stream.Stream;

public class stream1
{
    public static void main(String[] args)
    {
        ArrayList<String> lst = new ArrayList<String>();

        lst.add("Hello");
        lst.add("Hi");
        lst.add("Bye");
        lst.add("Goodbye");
        System.out.println(lst);

        Stream<String> mystream = lst.stream();

        System.out.println(mystream);

        Stream<Integer> limit = Stream.iterate(0, i -> i + 1).limit(100);
        Stream<String> limit1 = Stream.generate(() -> "Hello").limit(5);
        System.out.println(limit);
        System.out.println(limit1);

    }
}
