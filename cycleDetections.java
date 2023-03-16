static boolean hasCycle(SinglyLinkedListNode head) {
    //define a map that will store the current node as String and its occurrance as a key and value
    HashMap<String , Integer> map = new HashMap<>();
    //loop through the whole list
    while(head.next!=null){
        //if the map doesn't contain the current node
        if(map.containsKey(head.toString())==false){
            //put it in the map with value of 1
            map.put(head.toString(),1);
        }
        else{
            //if exists, which indicates that the current node has been visited before, return true
            return true;
        }
        //iterator 
        head=head.next;
    }
    //if the list passed the past check, then there are unique nodes in the map, in other words, no cycle
    return false;
}