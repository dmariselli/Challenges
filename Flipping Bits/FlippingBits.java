import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {
    
    public static void compute(long a){
        long res = 4294967295L - a;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.nextInt();
        while(kbd.hasNext()){
            compute(kbd.nextLong());
        }
    }
}