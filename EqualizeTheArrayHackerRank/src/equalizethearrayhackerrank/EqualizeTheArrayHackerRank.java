/*
 * Copyright 2020 @Prash
 */
package equalizethearrayhackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;
import java.util.Arrays;


public class EqualizeTheArrayHackerRank {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int cache[] = new int[100];
        int max=0;
        for(int i=0;i<arr.length;i++){
            cache[arr[i]-1]++;
        }
        for(int i=0;i<cache.length;i++){
            max = Math.max(max,cache[i]);
        }
        return Math.abs(max-arr.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = equalizeArray(arr);
        System.out.println(result);
        scanner.close();
    }
}
