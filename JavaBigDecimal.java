import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        sort(s, n);
            
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    
    public static void sort(String s[], int n) {
        BigDecimal temp1, temp2;
        String stemp;
        boolean moved = false;
        for (int i=1;i<n;i++) {
            temp1 = new BigDecimal(s[i - 1]);
            temp2 = new BigDecimal(s[i]);
            if (temp1.compareTo(temp2) == -1) {
                stemp = s[i - 1];
                s[i - 1] = s[i];
                s[i] = stemp;
                moved = true;
            }
        }
        if (moved) {
            sort(s, n);
        }
    }


}
