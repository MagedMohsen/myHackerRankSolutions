
    /*
     * Complete the 'reversePrint' function below.
     *
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static void reversePrint(SinglyLinkedListNode llist) {
        // the best way is to make use of recursion
        // first put an exit condition: head node is reached 
        if(llist!=null){
            // put a counter: traverse through the list by passing the node next to the head to the same function
            reversePrint(llist.next);
            // print the head data.
            System.out.println(llist.data);
            // thanks to recursion, the last node will be called as a head node and its data will be printed
            // then the node before the last one will be called, then the one before it and so on until head is printed
        }
        }
    
    