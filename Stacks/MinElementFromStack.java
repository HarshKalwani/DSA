package Stacks;

import java.util.Stack;

public class MinElementFromStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinElementFromStack(){
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    void push(int x){
        stack.push(x);

        if(minStack.isEmpty()){
            minStack.push(x);
            return;
        }
        int minTillNow = minStack.peek();
        if(minTillNow > x){
            minStack.push(x);
        }else{
            minStack.push(minTillNow);
        }
    }

    int pop(){
        if(stack.isEmpty()) return -1;
        minStack.pop();
        return stack.pop();
    }

    int getMin(){
        if(stack.isEmpty()) return -1;
        return minStack.peek();
    }
    
    public static void main(String[] args) {
        MinElementFromStack mini = new MinElementFromStack();
        mini.push(10);
        mini.push(20);
        mini.push(5);
        mini.push(40);
        mini.push(8);
        mini.push(30);

        System.out.println(mini.getMin());
        System.out.println(mini.getMin());
        System.out.println(mini.getMin());
    }
}
