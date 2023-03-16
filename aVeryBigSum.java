public static long aVeryBigSum(List<Long> ar) {
    // your daily dose of recursion
    //base case: last element is reached, return it already
    if(ar.size()==1){
        return ar.get(0);
    }
    //store the current first element before removing it
    long num = ar.get(0);
    ar.remove(0);
    //add the element to the recursion
    return(num+aVeryBigSum(ar));
}