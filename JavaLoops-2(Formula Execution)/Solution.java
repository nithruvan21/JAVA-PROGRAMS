import java.io.*;
import java.util.*;
/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of sequences: ");
        int t = sc.nextInt();
        for(int i=0; i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n= sc.nextInt();
            int m = 0;
            for(int j =0; j<n;j++){
                m += Math.pow(2, j)*b;
                int s = a + m;
                System.out.println(s);
            }
        }
    }
}