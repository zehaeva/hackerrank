import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] values = new int[n];
        int temp_sum;
        int negative_count = 0;
        for (int i=0;i<n;i++) {
            values[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i<n;i++) {
            temp_sum = 0;
            for (int j=i;j<n;j++) {
                temp_sum += values[j];
                if (temp_sum < 0) {
                    negative_count++;
                }
            }
        }
        System.out.println(negative_count);
    }
}
