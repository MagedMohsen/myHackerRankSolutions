import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static void getMaxElementFromStack(){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();
        
        Scanner input = new Scanner(System.in);
        
        int N = Integer.parseInt(input.nextLine());
        int temp = 0;
               
        while(input.hasNext())
        {
            String type[] = input.nextLine().split(" ");
            switch(type[0])
            {
                case "1":
                temp = Integer.parseInt(type[1]);
                stack.push(temp);
                 if(result.isEmpty() || result.peek() <= temp)
                     result.push(temp);
                break;
                case "2":
                temp = stack.pop();
                if(temp == result.peek())
                    result.pop();
                break;
                case "3":
                System.out.println(result.peek());
            }
            N--;
        }
        
        while(N-- > 0)
            System.out.println(result.peek());
        
    }
    public static void main(String[] args) {
        getMaxElementFromStack();
    }
}
