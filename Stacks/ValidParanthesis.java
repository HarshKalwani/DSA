package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String expression){
        Stack <Character> stack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(
                ch=='{' ||
                ch=='(' ||
                ch=='['
            ){
                //opening bracket
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch==')' && top!='(' || 
                    (ch==']') && top!='[' || 
                    (ch=='}') && top!='{') 
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidParanthesis.isValid("{[]()}"));
    }
}
