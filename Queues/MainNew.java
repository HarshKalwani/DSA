package Queues;

public class MainNew {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        // System.out.println(myQueue.dequeue());


        myQueue.enqueue(4);

        

        System.out.println(myQueue);
    }
}
