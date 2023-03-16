public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    //create a new node that points to the passed node's next node
    DoublyLinkedListNode node = llist.next;
    //reverse the passed node pointers, make its next is its prev
    llist.next=llist.prev;
    //and its prev is the new node
    llist.prev = node;
    //exit condition, when you reach the end of the list
    if (node==null){
        return llist;
    }
    //use recursion by passing the new node
    //explanation: the recursion will reverse the passed node which is the node next node
    //so, a new node will be created and will be pointing to the next of the passed node
    //the passed note will be reversed, and the new node will be passed to the recursion again
    //until the exit condition is reached
    //it's a lot to take, soooo take it slooow
    else{
        return reverse(node);
    }
        
}