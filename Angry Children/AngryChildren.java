import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AngryChildren {
   
   public static int compute(int k, int[] a){
       Arrays.sort(a);
       int upper = k-1;
       int result = Integer.MAX_VALUE;
       while (upper<=a.length-1){
           if (a[upper]-a[upper-k+1] < result)
               result = a[upper]-a[upper-k+1];
           upper++;
       }
       return result;   
   }

   public static void main(String[] args) throws NumberFormatException, IOException {
       Scanner kbd = new Scanner(System.in);
       int n = kbd.nextInt();
       int k = kbd.nextInt();
       int i = 0;
       int[] nums = new int[n];
       while(kbd.hasNext()){
           nums[i++] = kbd.nextInt();
       }
       System.out.println(compute(k,nums));
   }
}