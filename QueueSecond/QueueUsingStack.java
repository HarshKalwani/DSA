package QueueSecond;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class QueueUsingStack {
    private Stack <Integer> s1;
    private Stack <Integer> s2;

    public QueueUsingStack(){
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enqueue(int val){
        s1.push(val);
    }

    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
