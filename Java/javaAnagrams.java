import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        //first, make the strings uppercase as it is NOT case sensitive
        a=a.toUpperCase();
        b=b.toUpperCase();

        //for a starter, check if the strings are of the same length 
        if(a.length()==b.length())

        {
            // since we are dealing with characters, we can use their ASCII numbers which ranges from 65 to 90 (Upper case only)
            // so, intialize two arrays of 90 characters
            // the point is to make a hashmap but with an array because Hackerrank locked the libraries that can be imported
            // so, every element represents a character, i.e: arr[65] represents 'A'
            // each element's value will be that character's frequency, i.e: arr[65]=2 means that you have 2 'A'
            int[] A = new int[90];
            int[] B = new int[90];
            for (int i = 0; i < a.length(); i++) {
                // fill both arrays with the frequency of the characters 
                // we have to cast char to an int to obtain its ASCII
                A[(int) a.charAt(i)] += 1;
                B[(int) b.charAt(i)] += 1;
            }
            // now compare both arrays
            for (int i = 0; i < 90; i++) {
                // if there is an element (character) that doesn't have the same value (frequencey), return false
                if (A[i] != B[i])
                    return false;

            }
            // if all the elements are equal return true
            return true;
        }
        else // if the strings are not of the same length from the begining, return false
        {
            return false;
        }
        // that's it! if we could import java.util.HashMap to use hashmap instead would be a lot easier
        // the easier of both if we can use Arrays.sort(); but again we can't import java.util.Arrays

        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}