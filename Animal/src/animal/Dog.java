
package animal;

public class Dog extends Animal{
    
    public Dog(){
        super(15);
        System.out.println("A Dog has been created");
    }
    
    public void eat(){
        System.out.println("A Dog is eating");
    }
    
    //public abstract eat();
    
    public void sleep(){
        System.out.println("A Dog is sleeping");
    }
    
    public void ruff(){
        System.out.println("The Dog says ruff");
    }
    
    public void run(){
        System.out.println("A Dog is running");
    }
}
