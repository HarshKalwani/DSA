package QueueSecond;

import java.util.ArrayDeque;
import java.util.Queue;


/*
 add() = for adding 
 remove() = for removing 
 offer() = add the elements (will add to queue even after the queue is full but wont throw an exception);
 poll() = remove the elements from queue (will remove the elements from queue but wont throw exception even if queue is empty());
 */
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1); //enqueue
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);
        queue.remove();
        queue.remove();

        System.out.println(queue);
    }
}
