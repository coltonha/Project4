package project4;

public class QueueTest {
    public static void main(String[] args) throws Exception{
        Queue aQueue= new Queue();
        Queue bQueue= new Queue();
        for(int i=0; i<9; i++){
            aQueue.enqueue(i);
            bQueue.enqueue(i);
        }
        aQueue.dequeue();
        bQueue.dequeueAll();
        System.out.println(aQueue.isEmpty());
        System.out.println(aQueue.peek());
        System.out.println(bQueue.isEmpty());
    }
}
