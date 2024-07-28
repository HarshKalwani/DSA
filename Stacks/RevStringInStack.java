package Stacks;

import java.util.Stack;

public class RevStringInStack {
    public static void main(String[] args) {
        String str = "HarshJi";
        Stack <Character> stack = new Stack<>();

        StringBuilder string  = new StringBuilder();
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            string.append(stack.pop());
        }

        System.out.println(string.toString());
    }
}
