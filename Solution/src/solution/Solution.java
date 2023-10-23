package solution;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.*; 
import java.io.*;

public class Solution {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
 
        if(A.compareToIgnoreCase(B)>1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase());
        char[] charA = A.toCharArray();
        System.out.println(A.contentEquals(B));
        for(char a='a';a<='z';a++){
            System.out.println(a);
        }
        sc.close();
    }

}
