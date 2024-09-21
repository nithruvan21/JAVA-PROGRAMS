import java.io.*;
import java.util.*;

class Result{
    public static void uniqueInteger(ArrayList<Integer> arr){
        int unique = 0;
        for(int i = 0 ; i < arr.size(); i++){
            int counter = 0;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    counter++;
                }
            }
            if (counter <= 1) {
                unique = arr.get(i);
            }
        }
        System.out.println("Unique Integer: "+unique);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of integers you want to enter: ");
        int n = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<Integer>(); 
        for(int i = 0 ; i < n ; i++){
            Arr.add(i, sc.nextInt());
        }
        Result.uniqueInteger(Arr);
    }
}