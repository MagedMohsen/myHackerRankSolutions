import java.io.*;
import java.util.*;

class Result {



    public static int hourglassSum(List<List<Integer>> arr) {
    /*
     * using 2 Arraylists as a 2D array is such a pain
     * but as long as we understand that this is an Arraylist of Arraylists it gets easier
     * let's begin! to get the first element of this matrix will be as follow:
     *            Arraylist.get(0).get(0);
     *          this for the row ↑       ↑ and this for the column
     * So, to go along the entire 6×6 matrix, we use for loop, of course, but our limits will be:
     * we can't construct an hourglass pattern using the fifth and the sixth row as a starter, so rows < 4
     * also we can't use the fifth and the sixth column either, so column < 4
     * note that 4 is the index of the fifth, remember?
     */
    int sum=0;
    int max=Integer.MIN_VALUE;
    for (int row=0;row<4;row++){ //4 is the index of the fifth row which is our limit
        for (int col=0;col<4;col++){ //same here with the fifth column
            sum=arr.get(row).get(col)+arr.get(row).get(col+1)+arr.get(row).get(col+2);//the first row of the current hourglass, we take the first 3 elements
            sum+=arr.get(row+1).get(col+1);// the second row, we take the second element only
            sum+=arr.get(row+2).get(col)+arr.get(row+2).get(col+1)+arr.get(row+2).get(col+2);// the last row, we take the first 3 elements
            // we had to separate the sum of the 7 elements of the hourglass to make it easier to read,
            // imagine that the past three loCs are one line!
            if(sum>max){ //compare the sum with the value of the max in the same loop
                max=sum;
            }
        }
    }
    return max;

    }

}

public class java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
