public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    //define a new list to be returned further
    List<Integer> results = new ArrayList<>();
    //initialize alice's and bob's scores
    int alice =0;
    int bob=0;
    //loop three times, which is the 3 elements in each list
    for(int i =0;i<3;i++){
        //if alice's score is greater than bob's
        if(a.get(i)>b.get(i)){
            //1 point to gryff.. i mean alice
            alice++;
        }
        //else if alice's score is smaller than bob's
        else if (a.get(i)<b.get(i)){
            //1 point to bob
            bob++;
        }
    }
    //add alice's score and bob's to the result array and return it
    results.add(alice);
    results.add(bob);
    return results;
}