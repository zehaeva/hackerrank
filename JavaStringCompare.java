import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = sc.nextInt();
        int stop = s.length() - length;
        String smallest = s.substring(0, length);
        String largest = s.substring(0, length);
        for (int i=0;i<=stop;i++) {
            if (s.substring(i, length + i).compareTo(smallest) < 0) {
                smallest = s.substring(i, length + i);
            }
            if (s.substring(i, length + i).compareTo(largest) > 0) {
                largest = s.substring(i, length + i);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
