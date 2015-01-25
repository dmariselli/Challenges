import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsFibo {
    
    public static long[] fibNums = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296L, 433494437L, 701408733L, 1134903170L, 1836311903L, 2971215073L, 4807526976L, 7778742049L, 12586269025L, 20365011074L, 32951280099L, 53316291173L, 86267571272L};
    
    public static Map<String, String> fibMap = new HashMap<String, String>();
    
    static void fibInit(){
        for (long nums : fibNums){
            String keys = Long.toString(nums);
            fibMap.put(keys, "1");
        }
    }
    
    static String fibTest(long a){
        String test = Long.toString(a);
        if (fibMap.containsKey(test))
            return "IsFibo";
        else
            return "IsNotFibo";
    }
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int fib = kbd.nextInt();
        fibInit();
        while(kbd.hasNext()){
            long result = Long.parseLong(kbd.next(), 10);   
            System.out.println(fibTest(result));
        }
    }
}