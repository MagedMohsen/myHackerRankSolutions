
//////////////////////////////////////////////////////////////////////////////////

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

     // Note: I had to define this method outside the Solution class because the main method can't see this static method inside the class
     // Ok, let's begin
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // create a node with the passed data
        SinglyLinkedListNode current = new SinglyLinkedListNode(data);
        // check if the position is 0 which is the head node
        if (position==0){
            // make the created node points to the head node
            current.next=llist;
            // return head node which is now the newly created node
            return current;
        }
        // if the position is anyhting but 0
        // first, create a temp node and assign the head to it
        SinglyLinkedListNode temp=llist;
        for (int i=0;i<position-1;i++){// start from head node and stop right behind the desired position
            temp=temp.next;
        }
        // now temp node is pointing to the desired position
        // make the created node points to what temp points to which is the desired position
        current.next=temp.next;
        // make the temp node points to the created node.
        temp.next=current;
        // the situation now is as follows:
        // the temp node has replaced the node before the desired position and now points to the created node
        // the created node is now at the desired position and is pointing to the node which was at the that position
        // Finally, return head node
        return llist;
    
    }
