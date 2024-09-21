import java.io.*;
import java.util.*;

public class Solution{
    public static void isPrime(int n){
        for(int i = 3; i<n;i++){
            int count = 0;
            for(int j = 2; j<((i/2)+1);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0) System.out.println(i+" is a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}