// such a pain
// this is the only to solve it, I don't know how HackerRank ranks this one easy!!
// the idea is to know each node's distance from the middle of the tree
// then print the middle, the right and left of the middle, the right and left of the past nodes, etc...
// and neglect any node that cannot be seen because it has less distance than the distances of all the above nodes 
// to do this, we have to define a new data type (class) which will hold a node and its distance from the middle:
static class Rank{
    Node node;
    int coord;
    
    public Rank(Node node,int coord){
        this.node=node;
        this.coord=coord;
    }
}

public static void topView(Node root) {
    //sanity check
    if (root==null){
        return;
    }
    // create a TreeMap to store the seen nodes' data, will explain why I TreeMap and not HashMap
    Map<Integer,Integer> map = new TreeMap<>();
    // create a list to store the "ranks" (new data type or class) of each node, queue can be used and it's better 
    List<Rank> rankList = new ArrayList<>();
    // create your first rank which will be the root, pass the root itself and its distance = 0
    Rank rootRank = new Rank(root,0);
    // add the root's rank to the list
    rankList.add(rootRank);
    // do the following until the list is null
    while(rankList.size()!=0){
        //pop the first rank and get its data: node and distance
        Rank rank = rankList.remove(0);
        Node node = rank.node;
        int coord = rank.coord;
        // if the map doesn't contain the current node's distance
        if(map.containsKey(coord)==false){
            //push this node's data with its distance as a key to the map
            map.put(coord, node.data);
        }
        //if there is a left node for the current node
        if(node.left!=null){
            // create a new rank with the left node and a distance of -1 the current distance
            Rank newRank = new Rank(node.left,coord-1);
            rankList.add(newRank);
        }
        //if there is a right node for the current node
        if(node.right!=null){
            // create a new rank with the left node and a distance of +1 the current distance
            Rank newRank = new Rank(node.right,coord+1);
            rankList.add(newRank);
        }
        //so, the more you go left, the more negative your distance and vice versa
    }
    // now loop for each key-value pair in the TreeMap
    for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        //print each enrty's value which is the data of the seen nodes
        // the privilage the TreeMap grants us here is that it SORTS out the keys ascendingly
        // usage of HashMap will produce the same result but not sorted which will result in wrong answer
        System.out.print(entry.getValue()+" ");
    }
}