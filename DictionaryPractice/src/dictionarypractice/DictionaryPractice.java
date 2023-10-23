
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        //English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        //Inserting things
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        
        //Retriving
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        
        //Print out all keys        
        System.out.println(englSpanDictionary.keySet());
        
        //Print out all values
        System.out.println(englSpanDictionary.values());
        
        //Print out size
        System.out.println("The size is "+ englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        //Shopping List
        
        Map<String,Boolean>shoppingList = new HashMap<String,Boolean>();
        
        //Inserting stuff
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        
        //Printing items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        System.out.println();
        
        //Key-Value Pairs printout
        System.out.println(shoppingList.toString());
         //Checking if empty?
        System.out.println(shoppingList.isEmpty());
        System.out.println();
        
        //Replace vlaues
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        System.out.println();
        
        //Remove items
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        System.out.println();
        
        //Clear Out Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //Checking if empty?
        System.out.println(shoppingList.isEmpty());
        
        
    } 
    
}
