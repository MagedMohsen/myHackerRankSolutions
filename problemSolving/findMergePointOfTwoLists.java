static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    //create a new linked list
    List<SinglyLinkedListNode> list = new ArrayList<SinglyLinkedListNode>();
    //loop through the first list
    while(head1!=null){
        //add the current node to the custom list
        list.add(head1);
        head1=head1.next;
    }
    //loop through the other list
    while(head2!=null){
        //check if the custom list contains the current node
        if(list.contains(head2)){
            //if so, break the loop
            break;
        }
        head2=head2.next;
    }
    //the merging point is reached at where the head of the second list pointing to
    //return the head's data
    return head2.data;
}