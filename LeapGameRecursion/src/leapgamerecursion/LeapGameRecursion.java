
package leapgamerecursion;

import java.util.*;

public class LeapGameRecursion {
    
    
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }

    public static boolean isSolvable(int leap, int[]game, int i){
        //Base Cases
        if(i>=game.length){
            return true;
        }
        else if(i < 0 || game[i] == 1){
            return false;
        }

        game[i] = 1; //Marks as visited
        
        //Recursive Cases
        return isSolvable(leap,game,i+1) || isSolvable(leap,game,i-1) ||
        isSolvable(leap,game,i+leap);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
    
}
