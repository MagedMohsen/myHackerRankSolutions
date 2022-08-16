
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