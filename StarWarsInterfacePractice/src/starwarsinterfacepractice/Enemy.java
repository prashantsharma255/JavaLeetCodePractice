
package starwarsinterfacepractice;

public class Enemy implements Character{
    
    public String weapon = "Lightsaber";
    
    public Enemy(){
        
    }
    
    public String getWeapon(){
        return weapon;
    }
   
    public void attack(){
        System.out.println("The Enemy attacks YOU!");
    }
    
    public void heal(){
        System.out.println("The Enemy heals himself");
    }
    
    public void weaponDraw(){
        System.out.println("Draw out weapon");
    }
}
