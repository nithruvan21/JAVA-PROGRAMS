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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    List<Integer> arr = new ArrayList<Integer>();
    static double pc = 0;
    static double nc = 0;
    static double zc = 0;
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    if(arr.size()>0){
        for(double a : arr){
            if(a>0){
                pc++;
            }
            else if(a<0){
                nc++;
            }
            else{
                zc++;
            }
        }
    }
    double pcResult = pc/arr.size();
    double ncResult = nc/arr.size();
    double zcResult = zc/arr.size();
    DecimalFormat df = new DecimalFormat("#.000000");
    System.out.println(df.format(pcResult));
    System.out.println(df.format(ncResult));
    System.out.println(df.format(zcResult));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
