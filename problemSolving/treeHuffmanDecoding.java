// Huffman's decoding in a nutshell: you have a tree and a string of 1s and 0s..
// if the passed bit is 0 go left. if the passed bit is 1 go right until you reach a leaf node.
// if leaf node is reached, get that node's data

//you have base cases: when leaf node is reached, and end of string is reached
//So, the idea is to loop through the string until a leaf node is reached then return to root again
void decode (String s, Node root) {
    //define a new node that refer to the root node, DON'T use the root or you won't be able to get back to it
    Node curr = root;
    //loop through the passed string
    for (int i =0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            //if current character is 0, make curr refer to its left node
            curr=curr.left;
        }
        else {
            //assuming that the string contains only 0s and 1s:
            //the current character is 1, make curr refer to its right node
            curr=curr.right;
        }
        //if a leaf node is reached, AKA no right or left refernce
        if (curr.left==null&& curr.right==null){
            //print the current node data and make the curr refer to root again to repeat the process with the following character
            System.out.print(curr.data);
            curr=root;
        }
    }
}