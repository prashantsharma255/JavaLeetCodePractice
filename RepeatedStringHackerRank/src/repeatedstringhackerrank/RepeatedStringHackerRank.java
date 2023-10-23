/*
 * Copyright 2020 @Prash
 */
package repeatedstringhackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStringHackerRank {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        String s1 = "";
        String sub = "";
        long charCount =0;
        s1 = String.join("", Collections.nCopies((int)n, s));
        if(s == "a"){
            charCount = n;
        }
        
        for(int i=0; i<n; i++){
            sub = s1.substring(0,9);
            if(sub.charAt(i)=='a'){
                charCount++;
            }
        }
    return charCount;
    }

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);
        
        System.out.println(result);

        scanner.close();
    }
}