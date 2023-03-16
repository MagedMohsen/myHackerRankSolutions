public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    //create a new node that holds the passed data to be inserted
    DoublyLinkedListNode inserted = new DoublyLinkedListNode(data);
    //exit condition
    if(head==null){
        return inserted;
    }
    //the data is smaller than or equal to the current node's data
    else if (data<=head.data){
        //insert the node before the current node, make its next node is the current
        inserted.next=head;
        //the current's prev node is the inserted
        head.prev=inserted;
        //return the inserted node
        return inserted;
    }
    else {
        //create a new node by recusrion of the next node
        //explanation: the recursion will return the node at which the data is smaller than its
        //so, copy paste the above else if block statements but replace inserted with head, and head with temp
        //then return head which will be, at the moment, the node that has been insterted
        DoublyLinkedListNode temp = sortedInsert(head.next, data);
        head.next = temp;
        temp.prev = head;
        return head;
    }
}