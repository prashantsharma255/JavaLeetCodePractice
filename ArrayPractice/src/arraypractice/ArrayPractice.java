
package arraypractice;

import java.util.Arrays;

public class ArrayPractice {
    
    public static <E> void printArray(E[] array){
        for(E element : array){
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Array can be of int, string and char
        
        //Random Objects from Array
        //Math.abs(rand.nextInt) % length;
        
        Integer[] intArray1; 
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {34,23,6,3};
        
        String[] shoppingList={"Bananas","Apples","Pears"};
        
        intArray2[0] = 45;
        intArray2[1] = 67;
        intArray2[2] = 89;
        intArray2[3] = 45;
        
        printArray(intArray2);
        
        //Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        
        printArray(intArray2);
        printArray(intArray3);
        
        //Retrieve Objects
        
        System.out.println(intArray2[3]);
        
        
        //Given Functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        //Print String Array
        printArray(shoppingList);
        
        // For Loop : foreach
        
        for(String s : shoppingList){
            System.out.println(s);
        }
        
    }
    
}
