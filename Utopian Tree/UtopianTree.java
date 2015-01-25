import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {
    
    public static int uTree(int a){
        int height = 0;
        for (int i=0; i<=a; i++){
            if(i%2==0){
                height++;
            }
            else if (i%2!=0){
                height *= 2;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.nextInt();
        while(kbd.hasNext()){
            System.out.println(uTree(kbd.nextInt()));
        }
    }
}