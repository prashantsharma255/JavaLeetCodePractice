
package primenumber;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class PrimeNumber {
    
    public static boolean isPrime(int a){
        if(a%2==0){
            return false;
        }
        for(int i=3;i<Math.sqrt(a);i=i+2){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(isPrime(a)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
