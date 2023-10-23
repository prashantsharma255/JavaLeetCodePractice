
package linkedlist;

public class Node <D>{
    //Properties
    Node <D> next;
    D data;
    
    //Methods
    
    //Constructors
    public Node(D newData){
        data = newData;
        next = null;
    }
    
    public Node(D newData,Node<D> newNext){
        data = newData;
        next = newNext;
    }
    
    //Getter & Setters
    
    public D getData(){
        return data;
    }
    
    public Node<D> getNext(){
        return next;
    }
    
    public void setData(D newData){
        data = newData; 
    }
    
    public void setNext(Node<D> nextNode){
        next = nextNode;
    }
}
