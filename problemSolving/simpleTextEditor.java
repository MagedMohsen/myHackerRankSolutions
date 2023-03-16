import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
//I'm sorry, I have failed y'all. I can't get past the time runout termination
//but here is the solution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //pass the number of operations from the user in a long data type 
        //because for some reason, one case has A MILLION operations !!!!!!!!!
        long opNum = input.nextInt();

        //define operation code and index of in case of deletion and printing
        int op, index;
        //define two strings to hold the text to be edited
        String last, newString;
        //define a stack to memorize the operations done to the string
        Stack<String> stack = new Stack<>();

        //loop until the user finishes their operations 
        while(opNum-->0){
            //get the operation code
            op = input.nextInt();
            //check that code
            switch (op){
                //code 1 is appending a following text to the string 
                case 1:
                    //first, check if the stack has a passed string
                    //if so assign it to 'last' string
                    //if no, assing "" to 'last' string
                    last = stack.size() > 0 ? stack.peek() : "";
                    //assign the 'newString' with the 'last' string and the passed text
                    newString = last + input.next();
                    //push that 'newString'to the stack
                    stack.push(newString);
                    //don't forget to break from the switch 
                    break;
                case 2:
                    //get the next input which will be the number of characters to be deleted from the back of the string
                    index = input.nextInt();
                    //assign the top string in the stack to the 'last' string 
                    last = stack.peek();
                    //delete the n numbers of characters from the end of the 'last' string
                    //and assign it to the 'newString'
                    newString = last.substring(0, last.length()-index);
                    //push that 'newString' to the stack
                    stack.push(newString);
                    //break from the switch 
                    break;
                case 3:
                    //get the next input which will be the index of the character to be printed
                    //note that the problem meant 1-index not 0-index, in other words, if 1 is passed it means index of 0
                    index = input.nextInt()-1;
                    //check if the stack has pushed strings
                    if(stack.size() > 0) {
                        //assgin the top string from the stack to the 'last' string
                        last = stack.peek();
                        //print the inputed index of the 'last' string
                        String c = String.valueOf(last.charAt(index));
                        System.out.println(c);
                    }
                    //BREAK...FROM...THE...SWITCH
                    break;
                case 4:
                    //simply pop the top string
                    stack.pop();
                    break;
            }
        }
    }
}
