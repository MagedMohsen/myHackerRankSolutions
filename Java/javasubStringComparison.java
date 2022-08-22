import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
                
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // first, intialize smallest and latgest by making them the first possible substring
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // now take every possible substring and compare it with both smallest and largest
        // note that our boundaries will be from 0 to s.length()-k as you cannot take a substring after that
        // for example:  "welcometojava" the last possible substring of length 3 is "ava" 
        for (int i=0;i<s.length()-k+1;i++){
            //make a new substring of the current value of i and i+k
            String substr = s.substring(i, i+k);
            // compare it with smallest
            if (substr.compareTo(smallest)<0){
                smallest =substr;
            }
            // compare it with largest
            if (substr.compareTo(largest)>0){
                largest =substr;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}