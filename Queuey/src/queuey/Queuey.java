
package queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey <D>{
    
    LinkedList <D> queue = new LinkedList();
    
    //Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
    //Enqueuing an item
    public void enqueue(D n){
        queue.addLast(n);
    }
    
    public D dequeue(){
        return queue.remove(0);
    }
    
    //Peek at first item
    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> stacky = new Stack<String>();
        stacky.push("There");
        stacky.push("Hi");
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + ".");
        System.out.println("Size: "+stacky.size());


        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("There");
        System.out.println(stringQueue.dequeue()+" ");
        System.out.println(stringQueue.dequeue()+".");




        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        System.out.println("First out "+ numberQueue.dequeue());
        System.out.println("Peek at second item: "+ numberQueue.peek());
        System.out.println("Second out "+ numberQueue.dequeue());
        System.out.println("Third out "+ numberQueue.dequeue());
    }
    
}
