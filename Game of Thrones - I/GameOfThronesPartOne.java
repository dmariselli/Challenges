import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThronesPartOne {

    public static String compute(String a){
        char[] code = a.toCharArray();
        int[] seen = new int['z'+1];
        int odd = 0;
        for (char c : code)
            seen[(int) c]+=1;
        for (int s : seen)
            if (s%2!=0)
                odd+=1;
        if (odd>1)
            return "NO";
        else return "YES";
    }
    
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        System.out.println(compute(inputString));
        myScan.close();
    }
}