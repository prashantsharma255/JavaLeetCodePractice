package basic;


public class car {
    
    int maxSpeed; 
    int minSpeed;
    
    double weight;
    //Boolean is True or False;
    
    boolean isTheCarOn = false;
    char condition;
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar= 1;
    int maxNumberOfPeopleInCar=6;
    
    public car(){
        
    }
    public car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed=customMaxSpeed;
        weight=customWeight;
        isTheCarOn= customIsTheCarOn;
    }
    
    //Getters and Setters
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed(){
        return this.minSpeed;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public boolean isTheCarOn(){
        return this.isTheCarOn;
    }
    
    public void printVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn(){
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }else{
            System.out.println("The Car is full " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }
    
    public void getOut(){
        if(numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        }
        else{
            System.out.println("No one is in the car");
        }
    }
    
    public double howManyMilesTillOutOfGas(){
         return currentFuel = mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }
    
    public void turnTheCarOn(){
        if (!isTheCarOn){
            isTheCarOn=true;
        }
        else{
            System.out.println("The car is already on " + isTheCarOn);
        }
    }
    
    
    public static void main(String[] args){
      
       car tommyCar = new car();
       tommyCar.getOut();
       tommyCar.getOut();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOn();
       
       
      // System.out.println("Christmaas Present");
      // car christmasPresent = new car(550, 2000, false);
      // christmasPresent.printVariables();
    }
}
