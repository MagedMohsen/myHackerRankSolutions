import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        // Note: that solution doesn't pass some tests and at this moment I don't know why

        // first let's remove all leading non letter characters
        // i.e: "   @#$ % )`~%    I'm just a poor boy nobody loves me"
        // these lines will crop the string to start at "I'm....~"

        int index; // the counter is defined outside for(){} expression because we will need it outside the loop
        for (index = 0; index< s.length(); index++) {
            if (Character.isLetter(s.charAt(index))) {
                // stop right at the first letter you encounter
                break;
            }
        }
        // create a substring starting from the first encountered letter
        s=s.substring(index);

        // check if the string has no letters
        if (s.length() == 0) {
            System.out.println(0);
        }

        // split the string into an array of tokens based on regex [^a-zA-Z]+ which splits non-alphabetic characters
        String[] tokens = s.split("[^a-zA-Z]+");

        // print number of tokens
        System.out.println(tokens.length);

        // print the tokens using foreach
        for (String str: tokens){
            System.out.println(str);
        }
        scan.close();
    }
}

