
package runtimepractice;

import java.util.ArrayList;
import java.util.HashMap;


public class RunTimePractice {
    
    public static int findNumberOfReps(String s,char c){
        //Linear Time ; O(n) time
        int sum=0;
        for(int i=0; i< s.length();i++){
            if(s.charAt(i)==c){
                sum++;
            }
        }
        return sum;
    }
    
    public static int[] findNumberOfRepsV1(String s, char[]c){
        //Quad Time ; O(n * m) time
        int []sums = new int [c.length];
        for(int i=0; i<s.length();i++){
            for(int j=0; j< c.length;j++){
                if(s.charAt(i) == c[j]){
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }
    
    public static int[] findNumberOfRepsV2(String s, char[]c){
        //Optimal Time ; O(n) time
        int []sums = new int [c.length];
        HashMap<Character,Integer> map =new HashMap<>(); 
        for(int i=0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        for(int j=0; j < c.length; j++){
            int sum;
            if(!map.containsKey(c[j])){
                sums[j] = 0;
            }
            else{
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        System.out.println(findNumberOfReps("abcaaaaaaa",'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        char[] a = {'a','b'};
        
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepsV1("abcaaaaaaavdfijgfdigfdighfdidshgsioheioenccmdpckpasfjsifspgijfpqtjhepwignspgsrpiihnsiognvspovmsopvmsophlgsfpfgjepifjhqpjepgijpisgnspgnsdpgsdignjdspibnfspibnpfxniv",a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepsV2("abcaaaaaaavdfijgfdigfdighfdidshgsioheioenccmdpckpasfjsifspgijfpqtjhepwignspgsrpiihnsiognvspovmsopvmsophlgsfpfgjepifjhqpjepgijpisgnspgnsdpgsdignjdspibnfspibnpfxniv",a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
    
}
