package roundinghackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;

public class RoundingHackerRank {
    
    public static int[] solve(int[] grades) {
        
        for(int i=0; i<grades.length; i++){
            if(grades[i]>=38){
                int nextMultiple = ((grades[i] / 5) * 5) + 5;
                if((nextMultiple - grades[i])<3){
                    grades[i]= nextMultiple;
                }
            }
        }
        return grades;

    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] grades = new int[n];
        for(int i=0; i<n; i++){
            grades[i]=scan.nextInt();
        }
        int result[] = solve(grades);
        for(int i=0; i<n; i++){
            System.out.println(result[i]);
        }

    }
}
