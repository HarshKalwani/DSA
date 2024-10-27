package QueueSecond;

public class Mainnew {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue);
    }
}
