
/////////////////////////////////////////////////////////////////////////////////////////////////

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        //First, check if the head is empty
        if (llist==null){
            // if so, add a new node with the passed data and assign it to the head
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        // create a temporary node with the passed data
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        // make the temp node point to the head
        temp.next=llist;
        // assign the temp to the head. now the head has the data and points to the previous head.
        llist=temp;
        return llist;


    }
///////////////////////////////////////////////////////////////////////////////