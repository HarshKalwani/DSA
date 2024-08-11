package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
 add() - adds element from the queue 
 remove() - delete the element from the queue , Throws exception if queue is empty 
 peek() - tells the topmost element without removing them 
 offer() - work similar to add but it wont throw exception even if queue is full

 poll()removes the element from the queue but return null instead of exception of empty queue

 */
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);//enqueue
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // System.out.println(queue.remove());
        queue.offer(5);
        queue.offer(6);

        //Reverse of Queue

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        System.out.println(stack);

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
