public static int simpleArraySum(List<Integer> ar) {
    //recursion, ladies and gentelmen, saves the day as always
    //exit condition, the last item in the array is reached, return its value to be added further
    if (ar.size()==1){
        return ar.get(0);
    }
    //store the current first element of the array 
    int item = ar.get(0);
    //remove that first element
    ar.remove(0);
    //add that element to the recursion
    //explanation: the array now is -1 item, recursing the new array will get the current first element, delete it, add it to the recursion
    return(item+simpleArraySum(ar));
}