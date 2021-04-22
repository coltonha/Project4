/*
 * Project #4
 * Source Code File: Queue.java
 * Programmer: Sungwoong Ha
 * Due: 4/29/21
 * Description: This is a Java implementation of ADT Queue class.
 * 
 */
package project4;

public class Queue {
   private Node head,tail;
    
    public Queue(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return tail==null;
    }
    
    public void enqueue(int newItem){
        Node newNode= new Node(newItem);
        if (isEmpty()){
            head=newNode;
        }
        else{ 
            tail.next=newNode;
        }
        tail= newNode;
    }

    public int dequeue() throws Exception{
        if(!isEmpty()){
            Node newNode=head;
            head=head.next;
        return newNode.item;
        }
        else {
            throw new Exception("QueueException on dequeue");
        }
    }
    
    public void dequeueAll(){
        head=tail=null;
    }
    
    public int peek() throws Exception{
        if(!isEmpty()) {
            Node newNode=head;
            return newNode.item;
        }
        else{
            throw new Exception("QueueException on peek");
        }
    }


}
