import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh){
		Scanner input = new Scanner(System.in);
		// scan number of inputs
		// for some reason, using nextInt(); causes an error. So, scan it as a String then cast it to integer
		int n = Integer.parseInt(input.nextLine());
		// create a map
        HashMap<String,String> phonebook = new HashMap<String,String>();
		for(int i=0;i<n;i++){
			// scan for the name and the phone
			String name=input.nextLine();
			String phone=input.nextLine();
			// put them in the map
			phonebook.put(name, phone);
		}
		// for querys, since we can't tell how many queries it will have, using hasNextLine(); will do the trick
		while(input.hasNextLine()){
			// scan for the query
			String query=input.nextLine();
			// check if our map contains the query 
            if (phonebook.containsKey(query)){
                System.out.println(query+"="+phonebook.get(query));
            }
            else{
                System.out.println("Not found");
            }
		}
		// That's it! close your scanner
        input.close();
	}
}



