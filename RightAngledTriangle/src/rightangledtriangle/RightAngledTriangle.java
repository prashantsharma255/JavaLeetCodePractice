
package rightangledtriangle;

import java.util.Scanner;


public class RightAngledTriangle {
    
    public void RATorNot(int a,int b, int c){
        int s1 = a;
        int s2 = b;
        int s3 = c;
        
        if(s1>s2 && s1>s3 && ((s1*s1)==(s2*s2)+(s3*s3))){
            System.out.println("It's a Right Angled Triangle");
        }
        else if(s2>s1 && s2>s3 && ((s2*s2)==(s1*s1)+(s3*s3))){
            System.out.println("It's a Right Angled Triangle");
        }
        else if(s3>s1 && s3>s2 && ((s3*s3)==(s1*s1)+(s2*s2))){
            System.out.println("It's a Right Angled Triangle");
        }
        else{
            System.out.println("It's not a Right Angled Triangle");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        RightAngledTriangle rat = new  RightAngledTriangle();
        System.out.println("Enter The Three Sides");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        rat.RATorNot(s1, s2, s3);
    }
    
}
