public static void inOrder(Node root) {
    //if there is a left node, recurse left
    if(root.left!=null){
        inOrder(root.left);
    }
    //print the current node's data, which in the fist recursion is the left most node
    //and the last recursion will be the right most node
    //the root will in one of the middle recursions, doesn't have to be THE middle recusrion
    System.out.print(root.data+" ");
    //if there is a right node, recurse right
    if(root.right!=null){
        inOrder(root.right);
    }
}