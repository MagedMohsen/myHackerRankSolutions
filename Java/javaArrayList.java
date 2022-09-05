import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // the solution is as follows:
        Scanner input = new Scanner(System.in);
        // scan the first integer which is the number of arrays
        int numberOfArrays= input.nextInt();
        // make an arraylist of arraylists
        List<List<Integer>> arrays = new ArrayList<>();
        // fill those arraylists:
        for (int i=0;i<numberOfArrays;i++){
            // scan the next integer which is the array's size
            int size = input.nextInt();
            // make a new arraylist
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=0;j<size;j++){
                // scan the following integers
                int value = input.nextInt();
                // store them into the arraylist
                list.add(value);
            }
            // add the arraylist to the arraylist of arraylists----- say arraylist one more time XD
            arrays.add(list);
            
        }
        // now for the queries: scan number of queries
        int queries = input.nextInt();
        for (int i=0;i<queries;i++){
            // scan the coordinates of the query: the first is the number of the arraylist 
            int array=input.nextInt();
            // the second for the element to be queried 
            int list=input.nextInt();
            try{ // use try catch because quering of a non-existing element will raise an exception
                // array-1 and list-1 because the "list.get(0)" is the first element. remember?
                System.out.println(arrays.get(array-1).get(list-1));
            } catch (Exception e) {
                //if an exception arose, print "ERROR!"
            System.out.println("ERROR!");
            }
        }
        // THAT'S it! close your scanner
        input.close();
    }
}