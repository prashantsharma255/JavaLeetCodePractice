
package taumandbdayhackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TaumAndBDayHackerRank {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long blackGifts = in.nextLong();
            long whiteGifts = in.nextLong();
            long blackPrice = in.nextLong();
            long whitePrice = in.nextLong();
            long conversionPrice = in.nextLong();
            long minBlackPrice = Math.min(blackPrice, whitePrice + conversionPrice);
            long minWhitePrice = Math.min(whitePrice, blackPrice + conversionPrice);

            System.out.println((minBlackPrice * blackGifts) + (minWhitePrice * whiteGifts));
        }
    }
}
