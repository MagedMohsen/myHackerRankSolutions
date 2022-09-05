import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        // scan size of the array
        int size=input.nextInt();
        //create an arraylist
        List<Integer> list = new ArrayList<>();
        // fill it with the input
        for (int i=0;i<size;i++){
            int e = input.nextInt();
            list.add(e);
        }
        // scan number of queries
        int numOfQuery = input.nextInt();
        for (int i=0;i<numOfQuery;i++){
            // scan type of query
            String query=input.next();
            // if the current query is "Insert"
            if (query.equals("Insert")){
                // scan the index and value to be inserted
                int index=input.nextInt();
                int element=input.nextInt();
                // add this element to the list
                list.add(index,element);
                
            }
            // if the query is "Delete"
            else {
                // scan the index of the element to be deleted
                int index=input.nextInt();
                // delete that element
                list.remove(index);
            }
        }
        // close your scanner
        input.close();
        // print the resulted list as a single line of space-separated elements
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
        
    }
}