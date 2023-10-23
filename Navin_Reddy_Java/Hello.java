import java.util.*;
import java.lang.*;

class Hello {
    public static void main(String args[]){
        int bin = 0x4E6D;
        // System.out.println(bin);
        // char c = 'a';
        // c++;
        // System.out.println(c);
        String str = "abcde";
        String[] ch = str.split("");
        for (String t: ch){
            System.out.println(t);
        }
        int h = hammingDistance(4097,1025);
        System.out.println(h);
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        String stream = Integer.toBinaryString(z);
        for (int i = 0; i < stream.length(); i++){
            if (stream.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static String longestCommonPrefix (String[] strs) {
        String res= " "
    }


} 