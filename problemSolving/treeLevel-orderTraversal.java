
//Note: can be done with Queue or LinkedList
//Here I used an ArrayList
// the idea is to make a series of nodes,
// the root node is pushed first
// repeat the following using a loop:
// if the first node in the list has a left node, push it to the left
// if the same first node has a right node, push it to the list after the left node
// print the first node's data and pop it out from the list
public static void levelOrder(Node root) {
    
    //create a new ArrayList
    List<Node> nodes = new ArrayList<>();
    
    //push the root node first
    nodes.add(root);
    
    //loop throught the list
    while(nodes.size()!=0){
        //if the first node in the list has a left node, push it to the list
        if (nodes.get(0).left!=null){
            nodes.add(nodes.get(0).left);
        }
        //if the first node in the list has a right node, push it to the list
        if (nodes.get(0).right!=null){
            nodes.add(nodes.get(0).right);
        }
        // print the current first node's data, then remove it
        System.out.print(nodes.get(0).data+" ");
        nodes.remove(0);
    }
    
    
}