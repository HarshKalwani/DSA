package Queues;

public class MainNew {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.enqueue(6);
        myQueue.enqueue(7);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        myQueue.enqueue(8);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        

        

        System.out.println(myQueue);
    }
}
