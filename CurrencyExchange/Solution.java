import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usc = NumberFormat.getCurrencyInstance();
        NumberFormat indc = NumberFormat.getCurrencyInstance();
        NumberFormat chic = NumberFormat.getCurrencyInstance();
        NumberFormat frac = NumberFormat.getCurrencyInstance();
         
        usc.setCurrency(Currency.getInstance(Locale.US));
        indc.setCurrency(Currency.getInstance(Locale.ENGLISH));
        chic.setCurrency(Currency.getInstance(Locale.CHINA));
        frac.setCurrency(Currency.getInstance(Locale.FRANCE));



        String us = usc.format(payment);
        String india = indc.format(payment);
        String france = frac.format(payment);
        String china = chic.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}