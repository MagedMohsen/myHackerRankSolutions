public static Node insert(Node root,int data) {
    //base case: there is no tree left, either from the begining or after recursion
    if(root == null) {
        // assign the passed node a new node holding the passed data
        root = new Node(data);
        //second case: the passed data is smaller than the current node's data
    } else if(data<root.data){
        //recurse with the left node and assign the return to the current node's left
        root.left=insert(root.left,data);
        //third case: the passed data is greater than the current node's data
    } else if(data>root.data) {
        //recurse with the right node and assign the return to the current node's right
        root.right = insert(root.right,data);
    }
    //return the current node, which will be the new inserted node in all cases
    return root;
}
