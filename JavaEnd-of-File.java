import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String s;
        while(sc.hasNext()) {
            s = sc.nextLine();
            i++;
            System.out.printf("%d %s%n", i, s);
        }
    }
}
