import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheLoveLetterMystery {
    
    public static int compute(String a){
        char[] pal = a.toCharArray();
        if(pal.length<=1)
            return 0;
        int toChange = pal.length/2;
        char[] left = new char[toChange];
        char[] right = new char[toChange];
        for (int i=0; i<toChange; i++){
            left[i] = pal[i];
            right[i] = pal[pal.length-i-1];
        }
        
        int tally = 0;
        for (int i=0; i<left.length; i++){
            if (left[i]>right[i]){
                tally += left[i]-right[i];
            }
            else if (right[i]>left[i]){
                tally += right[i]-left[i];
            }
        }
        return tally;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.nextInt();
        while(kbd.hasNext()){
            System.out.println(compute(kbd.next()));
        }
    }
}