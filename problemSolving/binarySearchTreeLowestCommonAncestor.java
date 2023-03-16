
//There is simpler and waaaay better solution than this by just using recursion
//But C'est la vie 
//there are 3 main cases (yup main because of them has 3 inside cases):
//one of the values is the root, one of the values is the ancestor of the other, or the values' nodes are distant
public static Node lca(Node root, int v1, int v2) {
    //Case #1: check if one of the values are the root's data already, which in this case, the LCA will be root
    if(v1==root.data||v2==root.data){
        return root;
    }
    //define a node to move along the tree freely without losing root node
    Node curr = root;
    //define two nodes which will refer to the nodes that contain the two values
    Node n1 = root;
    Node n2 = root;
    // define two lists , stacks can be used also, to store the ancestors of each value
    List<Node> lN1 = new ArrayList<>();
    List<Node> lN2 = new ArrayList<>();
    //loop through the whole treeeee
    while (curr!=null){
        //if the first value v1 is smaller than current's data, add the current node to ancestors list and move to the left node
        if(v1<curr.data){
            lN1.add(curr);
            curr=curr.left;
        }
        //if the first value v1 is bigger than current's data, add the current node to ancestors list and move to the right node
        else if (v1>curr.data) {
            lN1.add(curr);
            curr=curr.right;
        }
        //if it is the node that contains the value, store current node in n1 and asign it to root to ues it again, and break the loop
        else {
            n1 = curr;
            curr=root;
            break;
        }
    }
    while(curr!=null){
        //if the first value v1 is smaller than current's data, add the current node to ancestors list and move to the left node
        if(v2<curr.data){
            lN2.add(curr);
            curr=curr.left;
        }
        //if the first value v1 is bigger than current's data, add the current node to ancestors list and move to the right node
        else if (v2>curr.data) {
            lN2.add(curr);
            curr=curr.right;
        }
        //if it is the node that contains the value, store current node in n1, and break the loop
        else {
            n2 = curr;
            break;
        }
    }
    //Case #2: if one the obtained nodes is the ancestor of the other, return that common ancestor
    if(n1.right==n2||n1.left==n2){
        return n1;
    }
    if(n2.right==n1||n2.left==n1){
        return n2;
    }
    //Case #3: the nodes are distant, there are three cases:
    // Case #3.1: the first node has more ancestors than the second
    if (lN1.size()>lN2.size()){
        //loop through first node's ancestors' list
        while(lN1.size()>1){
            //if the last anncestor of the first is the last ancestor of the second's
            if(lN1.get(lN1.size()-1)==lN2.get(lN2.size()-1)){
                //that's the LCA, so return it already
                return lN1.get(lN1.size()-1);
            }
            else {
                //if not, remove the last ancestor of the first nodes ONLY. leave the second's list of ancestors as is.
                lN1.remove(lN1.size()-1);
            }
        }
    }
    // Case #3.2: the first node has less ancestors than the second
    else if (lN1.size()<lN2.size()){
        //loop through second node's ancestors' list
        while(lN2.size()>1){
            //if the last anncestor of the second is the last ancestor of the first's
            if(lN2.get(lN2.size()-1)==lN1.get(lN1.size()-1)){
                //that's the LCA. you know the drill
                return lN2.get(lN2.size()-1);
            }
            else {
                //if not, remove the last ancestor of the second nodes ONLY. leave the second's list of ancestors as is.
                lN2.remove(lN2.size()-1);
            }
        }
    }
    // Case #3.3: both nodes have the same number of ancestors
    else {
        //loop though the list of one of them
        while(lN1.size()>1){
            //if the last ancestors of both are matched
            if(lN2.get(lN2.size()-1)==lN1.get(lN1.size()-1)){
                //return that ancestor
                return lN2.get(lN2.size()-1);
            }
            else {
                //remove that mismatched ancestor to continue the search
                lN1.remove(lN1.size()-1);
                lN2.remove(lN2.size()-1);
            }
        }
    }
    return root;
    
}