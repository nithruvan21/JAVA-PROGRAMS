import java.util.*;
import java.io.*;

public class Solution{
    public static void missingNum(int[] arr){
        // int max = arr[0];
        // int sum = 0;
        // for(int i : arr){
        //     sum+=i;
        //     if(i>max){
        //         max = i;
        //     }
        // }
        // int total = max*(max+1)/2;
        // System.out.println(total-sum);
        //___________________________________________ second method
        int max = arr.length+1;
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        int total = max*(max+1)/2;
        System.out.println(total-sum);
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,2};
        missingNum(arr);
    }
}