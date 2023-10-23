
package starwarsinterfacepractice;

public class Hero implements Character{
    
    String weapon = "The Force";
    
     public String getWeapon(){
        return weapon;
    }
   
    
    public void attack(){
        System.out.println("The Hero attacks the enemy");
    }
    
    public void heal(){
        System.out.println("The Hero heals you");
    }
    
}
