import java.io.*;
import java.util.*;

class Result {

    
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // this one is acceptable to all test cases as its complexty is O(m+n)
    // the idea is that you don't have to go from a to b elements and add k to them for each query
    // instead, add k to one element (a th) and substract it from one element (b+1 th)
    // then if you do a cummulative addition to the whole array elements, it will result in the final array
    long max=0;
    long sum=0;
    //again, initialize the array
    List<Integer> arr = new ArrayList<>();
    // fill it with 0s
    for (int k =0;k<n+1;k++){
        arr.add(0);
    }
    for (int i = 0; i < queries.size(); i++){//for each query
        int a=queries.get(i).get(0)-1;//value of a
        int b=queries.get(i).get(1)-1;// value of b
        int k=queries.get(i).get(2);// value of k
        //add k to the ath element only
        arr.set(a,arr.get(a)+k);
        // substract k from the (b+1)th element only
        if(b+1<n){
            arr.set(b+1,arr.get(b+1)-k);
        }
    
    }
    //sum all the elements but gradually
    // like: element 0 then elements 0+1 then elements 0+1+2 and so on....
    for (int i = 0; i < n; i++) {
      sum += arr.get(i);
      // catch the max value from the right to the left of the array
      // meaning that you don't have to store the array again then find the max value 
      max = Math.max(max, sum);
    }
    return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
