
package animal;


public class Cat extends Animal{
    
    public Cat(){
        super(7);
        System.out.println("A Cat has been created");
    }
    
      public void eat(){
        System.out.println("A Cat is eating");
    }
      
    //public abstract eat();
      
    public void sleep(){
        System.out.println("A Cat is sleeping");
    }
    
    public void meow(){
        System.out.println("A Cat meows");
    }
    
    public void prance(){
        System.out.println("A Cat is prancing");
    }
}
