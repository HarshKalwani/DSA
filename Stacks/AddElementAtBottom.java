package Stacks;

import java.util.Stack;

public class AddElementAtBottom {

    //This one takes time as it takes another stack so S.C increases
    public static Stack<Integer> pushBottom(Stack<Integer> myStack, int x){
        // Stack <Integer> temp = new Stack<>();
        // while(!myStack.isEmpty()){
        //     temp.push(myStack.pop());
        // }
        // temp.push(x);

        // while (!temp.isEmpty()) {
        //     myStack.push(temp.pop());
        // }

        if(myStack.isEmpty()){
            myStack.push(x);
            return myStack;
        }

        int num = myStack.pop();
        myStack = pushBottom(myStack, x);
        myStack.push(num);

        return myStack;
    }
}
