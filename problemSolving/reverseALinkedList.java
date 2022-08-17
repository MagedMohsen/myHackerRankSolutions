public 
/*
 * Complete the 'reverse' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
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
// Note: can be solved by recursion or stack, but this one is simpler

public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
// your casual check if the list is empty
if(llist==null){
    return null;
}
// Now! define 3 nodes: current, previous, next
// from their name, the previous points to current, the current points to next
SinglyLinkedListNode current=llist;
SinglyLinkedListNode prev=null;
SinglyLinkedListNode next=llist.next;
// traverse along the list
while(current!=null){//stop at tail
    // assign the node next to the current to (next) node, which in the first iteration will be the 2nd node
    next=current.next;
    // make the current points to the previous, which in the first iteration will be null
    current.next=prev;
    // assign the current to the previous, which in the first iteration, the head is assigned to previous
    prev=current;
    // assign (next) node to the current node, which in the first iteration will be the 2nd node
    current=next;
    // after first iteration is done, prev is the head and points to the 2nd node which is the current and (next) both. 
}
// after the loop, we now reversed the whole list except for head, it needs to be the last node and points to the one before
// which will be prev, why? because current is now null and prev is the last node which became the first
llist =prev;
// return head
return llist;
}

reverseALinkedList {
    
}
