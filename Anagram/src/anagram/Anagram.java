
package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.length() != b.length()){
        return false;
        }
        
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        
        Arrays.sort(aArr);
        a = new String(aArr);
        Arrays.sort(bArr);
        b = new String(bArr);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two Strings");
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
