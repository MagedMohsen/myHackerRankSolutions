
/////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
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

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // create a temp node
    SinglyLinkedListNode temp = llist;
    // if the deleted node will be the head node
    if (position==0&&llist!=null){
        // make temp point to the 2nd node
        temp=llist.next;
        // release head node from the linked list
        llist.next=null;
        // return temp which is now the head node
        return temp;
    }
    // if the linked list is empty return null
    if (llist==null){
        return null;
    }
    // if none of the past conditions apply, do the following:
    // create a node to traverse along the list to the node that will be deleted
    SinglyLinkedListNode Current = llist;
    for (int i=0;i<position-1;i++){// stop right before the node to be deleted
        Current=Current.next;
    }
    // make temp point to the deleted node (the node after the current)
    temp=Current.next;
    // make current node points to the node after the deleted node
    Current.next=temp.next;
    // release temp from the list (delete the wanted node)
    temp.next=null;
    // return head
    return llist;
    
    }
///////////////////////////////////////////////////////////////////////////////////
