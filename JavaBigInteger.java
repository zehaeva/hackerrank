import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger one = new BigInteger(sc.next());
        BigInteger two = new BigInteger(sc.next());
        System.out.println(one.add(two).toString());        
        System.out.println(one.multiply(two).toString());
    }
}
