import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class StackandQueueExample {
    public static void main(String[] args) {
        // Stack of Integers
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        int poppedInt = intStack.pop(); // Returns an Integer object
        System.out.println("Popped Integer: " + poppedInt);

        // Stack of Characters
        Stack<Character> charStack = new Stack<>();
        charStack.push('a');
        charStack.push('b');
        char poppedChar = charStack.pop(); // Returns a Character object
        System.out.println("Popped Character: " + poppedChar);

        // Stack of Doubles
        Stack<Double> doubleStack = new Stack<>();
        doubleStack.push(3.14);
        doubleStack.push(2.71);
        double poppedDouble = doubleStack.pop(); // Returns a Double object
        System.out.println("Popped Double: " + poppedDouble);

        Queue<Integer> intQueue = new LinkedList<>();

        // Add elements to the queue using autoboxing
        intQueue.offer(10);
        intQueue.offer(20);
        intQueue.offer(30);

        // Retrieve elements from the queue using unboxing
        int first = intQueue.poll();
        int second = intQueue.poll();

        System.out.println("First element: " + first);
        System.out.println("Second element: " + second);
    }
}