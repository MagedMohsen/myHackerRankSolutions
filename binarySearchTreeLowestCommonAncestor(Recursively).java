//recursion literally saves time and line of codes
//like my other yet bad solution, there are 3 cases:
//the root data (will be curren node in each recursion) is smaller than both, bigger than both, or is equal to one of them or both
public static Node lca(Node root, int v1, int v2) {


    //Smaller than both, call the function again but with the right node
    if(root.data<v1 && root.data<v2){
        return lca(root.right,v1,v2);
    }
    //Smaller than both, call the function again but with the left node
    if(root.data>v1 && root.data>v2){
        return lca(root.left,v1,v2);
    }

    //Equal to one them, return it.
    return root;
}