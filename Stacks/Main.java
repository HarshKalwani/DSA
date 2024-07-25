package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // System.out.println(stack);
        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());

        // while(!stack.empty()){
        //     Integer value = stack.pop();
        //     System.out.println(value);
        // }
        // System.out.println(stack);

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        // System.out.println(stack.size());
        System.out.println(stack.peek());
        
    }
}
