
package librarycatalog;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {
    //Properties/Fields/Global Variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod =7;
    double initialLateFee = 5.50;
    double feePerLateDay = 1.00;
    
    public LibraryCatalog(Map<String,Book> collection){
        this.bookCollection = collection;
    }
    
    public LibraryCatalog(Map<String,Book> collection,int lengthOfCheckOutPeriod,
            double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
        
    }
    
    //Getters
    
    public int getCurrentDay(){
        return this.currentDay;
    }
    
    public int getLengthOfCheckoutPeriod(){
        return this.lengthOfCheckoutPeriod;
    }
    
    public Map<String,Book> getBookCollection(){
        return this.bookCollection;
    }
    
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay(){
        return this.feePerLateDay;
    }
    
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
        
    }
    
    //Setters
    
    public void nextDay(){
        currentDay++;
    }
    
    public void setDay(int day){
        currentDay = day;
    }
    
    //Instance Methods
    
    public void checkOutBook(String title){
        Book book = getBook(title);
        if(book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You Just Checked Out "+title+". It is due on day "+
                    (getCurrentDay() + getLengthOfCheckoutPeriod())+".");
        }
    }
    
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate= currentDay - (book.getDayCheckedOut()+ getLengthOfCheckoutPeriod());
        if(daysLate>0){
            System.out.println("You owe the library $" +(getInitialLateFee() + daysLate * getFeePerLateDay())+
                    " because your book is "+ daysLate +" days overdue.");
        }else{
           System.out.println("Book Returned. Thank You");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, "+ book.getTitle()+" is already checked out. "
        + "It should be back on day "+ (book.getDayCheckedOut() + getLengthOfCheckoutPeriod())+".");
    }
    

 
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter",546644,999999);
        bookCollection.put("Harry Potter",harry);
        LibraryCatalog lib = new LibraryCatalog(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
    
}
