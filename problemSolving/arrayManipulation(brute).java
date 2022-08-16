import java.io.*;
import java.util.*;

class Result {

    
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // unfortunately that's the only soultion that came to my mind 
    // unfortunately×2 this solves the problem but with a complexty of O(m*(b-a))
    // So some test cases won't pass
    // Anyway, let's explain:

    
    long max=Integer.MIN_VALUE;
    // initialize the array to be manipulated
    List<Integer> arr = new ArrayList<>();
    // fill it with 0s
    for (int k =0;k<n+1;k++){
        arr.add(0);
    }
    
    for (int j=0;j<queries.size();j++){// for every query
       for (int i = (queries.get(j).get(0)-1);i<queries.get(j).get(1);i++){// from a to b of the current query
           int temp=arr.get(i)+(queries.get(j).get(2)); // add k to the value of the current element
           arr.set(i, temp);// replace the current element with the new value 
           if(arr.get(i)>max){// check if this is the max value 
               max = arr.get(i);
           }
        } 
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
