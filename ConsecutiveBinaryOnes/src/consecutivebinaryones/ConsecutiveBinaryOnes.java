
package consecutivebinaryones;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ConsecutiveBinaryOnes {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Binary Number to find the number of Consecutive 1s");
        int n = scanner.nextInt();
        char [] twobase = Integer.toBinaryString(n).toCharArray();
        int counter = 0;
        int max = 0;
         for(char nums: twobase){
            if(nums =='1')
            {
                counter++;   
            } else
            {
                counter=0;
            }
            if(max<counter){
            max = counter;
            }
        }

    System.out.println(max);
        scanner.close();
    }
}
