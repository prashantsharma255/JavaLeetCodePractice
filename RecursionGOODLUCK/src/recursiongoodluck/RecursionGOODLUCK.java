
package recursiongoodluck;

public class RecursionGOODLUCK {
    
    public static int Summation(int n){
        //Base Case(The End)
        if(n<=0){
            return 0; //Additive Identity Property
        }
        
        //Recursive Case(Keep Going)
        else{
            return n + Summation(n-1);
        }
    }
    
    public static int Factorial(int n){
        //Base Case
        if(n<=1){
            return 1; //Multiplicative Identity Property
        }
        //Recursive Case
        else{
            return n * Factorial(n-1);
        }
    }
    

    // 5 * 3 = 5 * 5 * 5
    public static int Exponentiation(int n, int p){
        //Base Case
        if(p<=0){ //Multiplicaitve Identity
            return 1;
        }
        //Recursive Case
        else{
            return n * Exponentiation(n,p-1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(10));
        System.out.println(Factorial(6));
        System.out.println(Exponentiation(5,5));
    }
    
}
