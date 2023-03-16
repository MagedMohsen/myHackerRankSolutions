import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class simpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String s = "";
        int op;
        int index;
        long opNum = input.nextInt();
        Stack<String> stack = new Stack<>();
        while(opNum>0){
            op = input.nextInt();
            switch(op){
                case 1:
                    s+=input.next();
                    stack.push(s);
                    break;
                case 2:
                    index = s.length() - (input.nextInt());
                    s=s.substring(0,index);
                    stack.push(s);
                    break;
                case 3:
                    index = input.nextInt()-1;
                    System.out.println(s.charAt(index));
                    break;
                case 4:
                    if (stack.isEmpty()==false){
                        stack.pop();
                        if (stack.isEmpty()==false){
                            s=stack.peek();
                        }
                    }
                    break;
            }
            opNum--;
            
        }
        input.close();
    }
}