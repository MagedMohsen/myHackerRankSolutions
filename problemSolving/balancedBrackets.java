class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        //some cases like the brackets numbers are not even, or no brackets at all
        if (s==null||s.length()%2!=0){
            return "NO";
        }
        //define a stack to push the opening brackets
        //and a map that contains the opening brackets as values and closing brackets as keys
        // to match them up below
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        //loop through the passed string 
        for (char c : s.toCharArray()){
            //if the current character is an opening bracket
            if ((c=='(')||(c=='{')||(c=='[')){
                //push it to the stack already. what are you waiting for??
                stack.push(c);

            }
            //if the current character is a closing bracket
            if ((c==')')||(c=='}')||(c==']')){
                //check if the stack is empty, which means that there is no perior opening bracket at all
                if (stack.isEmpty()){
                    //return no immediately
                    return "NO";
                }
                //check the top of the stack is matching with the current character from the map
                if (stack.peek()!=map.get(c)){
                    //if not return no
                    return "NO";
                    
                }
                else {
                    //if yes, pop that first character from the stack
                    stack.pop();

                }
            }
        }
        //check if there is no opening bracket left 
        if (stack.isEmpty()){
            return "YES";
        }
        else {
            //if not, return NOOOO
            return "NO";
        }
        
        
        }

}