package QueueSecond;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueOne {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(10);
        queue.add(4);
        queue.add(6);
        queue.add(9);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
