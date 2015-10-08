    import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
            String s=scan.nextLine();
        //Complete the code
            List<String> strings = new ArrayList<String>(Arrays.asList(s.split("[!,?._'@\". ]")));
            strings.removeAll(Arrays.asList("", " "));
            System.out.println(strings.size());
            for (String retval: strings){
                System.out.println(retval);
            }
        }
    }
