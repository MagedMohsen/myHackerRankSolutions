public static int diagonalDifference(List<List<Integer>> arr) {
    // visualize it first:
    // 0 1 2 3 4 5
    // 0 1 2 3 4 5
    // 0 1 2 3 4 5
    // 0 1 2 3 4 5
    // 0 1 2 3 4 5
    // 0 1 2 3 4 5
    // we have a list of a list, and we need to get the difference of the diagonals of these arrays
    // in other words, 0+1+2+3+4+5 the left-right diagonal, takes the the n element in the n array
    // 5+4+3+2+1+0 the right-left diagonal, takes the max-n element in the n array
    // one will go: get(0).get(0), get(1).get(1), get(2).get(2)
    //the other will go: get(0).get(6), get(1).get(5), get(2).get(4)
    //you see a pattern here? let's do it

    //initialize both diagonals
    //get the size of any of them, it doesn't matter since its a square mattrix
    int LRSum=0;
    int RLSum=0;
    int size = arr.size();
    //loop through the whole mattrix
    for (int i = 0;i<size;i++){
        //add the n element in the n array to the LR diagonal
        LRSum+=arr.get(i).get(i);
        //add the size-1-n element in the n array to the RL diagonal
        RLSum+=arr.get(i).get(size-i-1);
    }
    //return the absolute difference between them
    return Math.abs(LRSum-RLSum);
}