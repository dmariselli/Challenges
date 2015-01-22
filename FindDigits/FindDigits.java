import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    static int compute(int a, String b){
        int count = 0;
        char[] nums = b.toCharArray();
        for (int i=0; i<nums.length; i++){
            int div = Character.getNumericValue(nums[i]);
            if (div!=0){
                if (a%div==0){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int tests = kbd.nextInt();
        for (int i=0; i<tests; i++){
            Integer a = kbd.nextInt();
            String b = Integer.toString(a);
            System.out.println(compute(a,b));
        }
    }
}