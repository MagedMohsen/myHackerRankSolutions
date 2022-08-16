import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////
    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    // the solution as follows:
    
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        // create a node to traverse with it a long the list starting from the head
        SinglyLinkedListNode current = head;
        if (current==null){
            // first, if the head is empty, create a head with the passed data then return head
            // this condition will be executed only at the first data being passed to this function
            head = new SinglyLinkedListNode(data);
            return head;
        }
        // Now, traverse through the list until you reach the tail
        while(current.next!=null){// Note that (next) of the tail node equals null as there aren't any nodes past it
            // so as long as you are not at the tail, make the currnet node points to the next node
            current=current.next;
        }
        // when tail node is reached, create a new node after it with the passed data then return head and voila!
        current.next = new SinglyLinkedListNode(data);
        return head;

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
          
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
          llist.head = llist_head;
          
        }



        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
