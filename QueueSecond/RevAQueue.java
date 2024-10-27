package QueueSecond;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class RevAQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);


        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        System.out.println(stack);

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);
    }
}
