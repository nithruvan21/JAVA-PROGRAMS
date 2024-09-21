import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void median(List<Integer> arr) {

        int length = arr.size();
        System.out.println(length);
        int sortedArr[] = new int[length];
        for(int i=0;i<length;i++){
            sortedArr[i] = arr.get(i);
        }
        for(int i = 0; i < length-1; i++){
            int min_index = i;
            for(int j=i+1; j < length ; j++){
                if(sortedArr[j]<sortedArr[min_index]){
                    min_index=j;
                }
            }
            int temp = sortedArr[min_index];
            sortedArr[min_index]=sortedArr[i];
            sortedArr[i]=temp;
        }

        System.out.println("Median "+sortedArr[length/2]);

        for(int a:sortedArr){
            System.out.println(a);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.median(arr);

        bufferedReader.close();
    }
}
