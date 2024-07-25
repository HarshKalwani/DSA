package Stacks;

import java.util.EmptyStackException;

public class MyStack {
    private int[] items;
    private int top;
    private int size;
    
    public MyStack(int size){
        this.size= size;
        this.items = new int[size];
        this.top = 0; 
    }
    public void push (int value){
        if(top == size) throw new StackOverflowError();
        this.items[this.top]=value;
        this.top++;
    }

    public int size(){
        return top;
    }

    public int pop(){
        if(top ==0) throw new EmptyStackException();  //Stack Underflow
        this.top--;
        int value = this.items[top];
        items[top] = 0;
        return value;
    }

    public int peek(){
        if(top==0){
            System.out.println("Empty Stack");
            return -1;
        }
        return items[top-1];
    }


    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i = size-1 ; i >=0 ; i--){
            str.append(items[i]).append("\n");
        }

        return str.toString();
    }
    
}
