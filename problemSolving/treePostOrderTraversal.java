public static void postOrder(Node root) {
    //if there is a left node, recurse with the left ndoe
    if(root.left!=null){
        postOrder(root.left);
    }
    //and the same way with the right
    if(root.right!=null){
        postOrder(root.right);
    }
    //print the current node's data, which in the fist recusrion will be the most left node
    //and the last recursion will be root
    System.out.print(root.data + " ");
}