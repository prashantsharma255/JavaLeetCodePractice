
package minmax;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements){
        this.elements=elements;
    }

    public void computeDifference(){
        int min = Arrays.stream(elements).min().getAsInt();
        int max = Arrays.stream(elements).max().getAsInt();
        maximumDifference = max - min;

    }

    

} // End of Difference class

public class MinMax {

    public static void main(String[] args) {
        System.out.println("Enter number of Elements and the Elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
