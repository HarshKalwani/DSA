package Stacks;

import java.util.EmptyStackException;

public class TwoStacks {
    private int[] items ;
    private int top1;
    private int top2;
    private int size;

    public TwoStacks(int s){
        this.size = s;
        this.items = new int[s];
        this.top1 = 0;
        this.top2 =s-1;
    }

    public void push1(int value){
        if(top1 > top2) return;
        items[top1] = value;
        top1++;
    }

    public void push2(int value){
        if(top1 > top2) return;
        items[top2] = value;
        top2--;
    }

    public int pop1(){
        if(top1==0) throw new EmptyStackException();
        top1--;
        return items[top1];
    }

    public int pop2(){
        if(top2== size-1) throw new EmptyStackException();
        top2++;
        return items[top2];
    }

    public int peek1(){
        if(top1==0) throw new EmptyStackException();
        return items[top1-1];
    }

    public int peek2(){
        if(top2==size -1) throw new EmptyStackException();
        return items[top2 +1];
    }
}
