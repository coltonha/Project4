/*
 * Project #4
 * Source Code File: Node.java
 * Programmer: Sungwoong Ha
 * Due: 4/29/21
 * Description: This is a Java implementation of Node class.
 * 
 */
package project4;
public class Node {
    public int item;
    public Node next;
    public Node(){
        item=0;
        next=null;
    }
    public Node(int newItem){
        setItem(newItem);
    }
    public Node (int newItem, Node newNext){
        setItem(newItem);
        setNext(newNext);
    }

    public int getItem() {
        return item;
    }
    public Node getNext() {
        return next;
    }
    public void setItem(int newItem){
        item=newItem;
    }
    public void setNext(Node newNext) {
        next=newNext;
    }
    
}
