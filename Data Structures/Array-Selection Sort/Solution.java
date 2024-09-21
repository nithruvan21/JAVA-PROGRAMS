import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Result{
    public static void SelectionSort(ArrayList<Integer> arr) {
        int length = arr.size();
        for (int i=0; i<length-1;i++){
            int min_index = i;
            for (int j=i+1; j<length;j++){
                if(arr.get(min_index)>arr.get(j)){
                    min_index = j;
                }
            }
            int temp = arr.get(min_index);
            arr.set(min_index, arr.get(i));
            arr.set(i,temp);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

public class Solution{
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements do you want to add? ");
        int n = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int dup = sc.nextInt();
            Arr.add(dup);
        }
        Result.SelectionSort(Arr);
    }
}