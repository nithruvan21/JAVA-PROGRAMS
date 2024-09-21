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

    List<Integer> arr =new ArrayList<Integer>();
    static long minSum = 0; 
    static long maxSum = 0; 
    static long sum = 0; 
    static long min,max;

    public static void miniMaxSum(List<Integer> arr) {
        if (arr.size()>0){
            long minRes = arr.get(0);
            long maxRes = arr.get(0);
            for(int i =0; i<arr.size();i++){
                minRes = Math.min(minRes, arr.get(i));
                min = minRes;
                maxRes = Math.max(maxRes, arr.get(i));
                max = maxRes;
            }
            for(long a : arr){
                sum += a;
            }
            minSum = sum - max;
            maxSum = sum - min;
            System.out.println(minSum);
            System.out.println(maxSum);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
