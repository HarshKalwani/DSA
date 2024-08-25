package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class IntroPriorityQueue {
    public static void main(String[] args) {
     
        Queue <Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(10);
        queue.add(4);
        queue.add(-5);
        queue.add(-3);

        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}