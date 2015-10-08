import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
        char[] charA = A.toLowerCase().toCharArray();
        char[] charB = B.toLowerCase().toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        String newA = new String(charA);
        String newB = new String(charB);
        if (newA.equals(newB)) return true;
        else return false;
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
