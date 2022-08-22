import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //initialize the flag control
        boolean flag = false;
        // now we have 3 senarios of the scanned string:
        // the string is null, the string is a single character, and a string of more than 1 character
        // first, if the string is more than one character:
        if (A.length()>1){
            // its length can be even or odd, either way let's start from 0 to the character before the middle 
            for (int i=0;i<A.length()/2;i++){
                // compare the current character with its counterpart i.e: 0 with A.length()-1 | 1 with A.length()-2
                if(A.charAt(i)==A.charAt(A.length()-1-i)){
                    // if so, mark our flag
                    flag = true;
                }
                else flag = false;
            }
        }
        // the second senario: string of one character, in this case it's a palindrome. No other options
        else if (A.length()==1) flag = true;
        // the third senario: string with no characters, well, not a palindrome 
        else flag = false;
        sc.close();
        // ternary operator: if flag is true, print "Yes", else print "No" simple as that!
        System.out.println(flag?"Yes":"No");
    }
}



