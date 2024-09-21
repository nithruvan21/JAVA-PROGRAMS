import java.util.*;
import java.io.*;

public class Solution{
    public static void countDigits(int n){
        int count = 0;
        int dummy = n;
        while(dummy!=0){
            int temp = (int)(dummy%10);
            dummy/=10;
            if(n%temp==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countDigits(n);
    }
}