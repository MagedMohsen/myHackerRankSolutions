import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("US: %s%n", us.format(payment));
        System.out.printf("India: %s%n", india.format(payment));
        System.out.printf("China: %s%n", china.format(payment));
        System.out.printf("France: %s%n", france.format(payment));
    }
}