import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {

        int data;
        Node next;

        // Constructor 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data 
        Node new_node = new Node(data);


        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node 
            last.next = new_node;
        }

        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList 
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");

            // Go to next node 
            currNode = currNode.next;
        }
    }

    // Detect Loop using  Floyd's Cycle-Finding Algorithm
    static boolean detectLoop(Node head) {

        // Fast and slow pointers initially points to the head
        Node slow = head, fast = head;

        // Loop that runs while fast and slow pointer are not
        // null and not equal
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If fast and slow pointer points to the same node,
            // then the cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Driver code 
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // 
        // ******INSERTION****** 
        // 

        // Insert the values 
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList 
        printList(list);
        System.out.println("\n");
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(4);

        head1.next.next.next = head1.next;

        if (detectLoop(head1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}