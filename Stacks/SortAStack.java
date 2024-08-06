package Stacks;

import java.util.Stack;

public class SortAStack {
    //Reverse a stack in recursion 

    public static void insertSorted(Stack<Integer> myStacks , int num){
        if(myStacks.isEmpty()){
            myStacks.push(num);
            return;
        }

        int top = myStacks.peek();
        if(top <= num){
            myStacks.push(num);
        }else{
            myStacks.pop();
            insertSorted(myStacks, num);
            myStacks.push(top);
        }
    }
    public static Stack <Integer> sortStack(Stack<Integer> myStacks){
        if(myStacks.isEmpty()) return; 
        int num = myStacks.pop();
        sortStack(myStacks);
        insertSorted(myStacks , num);
    }
}
