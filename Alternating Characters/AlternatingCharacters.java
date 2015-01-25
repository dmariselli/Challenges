import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {
    
    public static int compute(String a){
        char[] ab = a.toCharArray();
        int seenA = 0;
        int seenB = 0;
        int result = 0;
        
        for (char c : ab){
            if (c=='A'){
                seenA +=1;
                seenB=0;
            }
            else if (c=='B'){
                seenB +=1;
                seenA = 0;
            }
            if (seenA>1){
                seenA -=1;
                result +=1;
            }
            else if (seenB>1){
                seenB -=1;
                result +=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.nextInt();
        while(kbd.hasNext()){
            System.out.println(compute(kbd.next()));
        }
    }
}