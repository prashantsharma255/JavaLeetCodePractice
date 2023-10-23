
package finddigitshackerrank;

import java.util.Scanner;

public class FindDigitsHackerRank {

    public static int[] Int_to_array(int n)
    {
	int j = 0;
	int len = Integer.toString(n).length();
	int[] arr = new int[len];
	while(n!=0)
	{
		arr[len-j-1] = n%10;
		n=n/10;
		j++;
	}
	return arr;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int len = Integer.toString(n).length();
    int[]arr = new int[len];
    arr = Int_to_array(n);
    System.out.println(arr);
    
    }
}
