import java.util.*;
import java.io.*;

public class Solution {

    public static boolean isValidParanthases(String par){
        int len = par.length();
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<len;i++){
            char c = par.charAt(i);
            if(stk.empty()){
                stk.push(c);
            }
            else if(stk.peek()=='(' && c==')'){
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
        return stk.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parantheses = sc.nextLine();
        System.out.println(isValidParanthases(parantheses));
    }
}