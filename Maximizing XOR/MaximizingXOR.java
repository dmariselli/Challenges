import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizingXOR {

    static int maxXor(int l, int r) {
        int result=0;
        for (int i=l; i<=r; i++){
            for (int j=l; j<=r; j++){
                int posRes = i ^ j;
                if (posRes>result)
                    result = posRes;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
