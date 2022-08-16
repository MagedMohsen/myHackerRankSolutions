import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

            //Note:  can be solved with HashMap but I prefer Arraylist

    // create a new array for the count of the matching strings
    List<Integer> matching = new ArrayList<>();
    int count=0;
    for (int i=0; i<queries.size();i++){ //for every string in the queries
        for (int j =0;j<strings.size();j++){ //for every string in strings
            //compare the queried string with the current string 
            if (queries.get(i).equals(strings.get(j))){
                //add your typical counter
                count++;
            }
        }
        //after matching a queried string with all strings, add the counter to the counter array
        matching.add(count);
        //reset the counter to use it again for the next query
        count=0;
        
    }
    return matching;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = bufferedReader.readLine();
            strings.add(stringsItem);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        List<Integer> res = Result.matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
