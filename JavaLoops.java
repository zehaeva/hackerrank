import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int a;
        int b;
        int n;
        int return_value;
        for (int i=0;i<testcases;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            return_value = 0;
            for (int j=0;j<n;j++) {
                return_value += Math.pow(2, j) * b;
                System.out.printf("%d ", (a + return_value));
            }
            System.out.printf("%n");
        }
    }
}
