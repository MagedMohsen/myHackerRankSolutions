public static void preOrder(Node root) {
    //print the current node data, which in the case of first recursion is the rooooot
    System.out.print(root.data+" ");
    //if there is a left node, recurse with the left node
    if(root.left!=null){
        preOrder(root.left);
    }
    //aaaand, if there is a right node, recurse with right node
    //this is only way, because you need to get back the node after going left or right
    //which can't be done with loops
    if (root.right!=null){
        preOrder(root.right);
    }
}