package Stacks;

import java.util.EmptyStackException;

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class StackWithLinkedList {
    private Node head;
    private int size = 0;
    
    public StackWithLinkedList(){
        head=null;
        size = 0;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int value){
        Node node = new Node (value);
        if(head == null) {
            head=node;
        }else{
            node.next = head;
            head= node;
        } 
        size++;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();

        else{
            Node current = head;
            int element = current.data;
            head = current.next;
            current.next = null;

            size--;
            return element;
        }
    }

    public int peek(){
        return head.data;
    }

    public String toString(){
        Node current = head;
        StringBuilder str = new StringBuilder();
        while(current !=null){
            str.append(current.data);
            if(current.next != null){
                str.append("-->");
            }
            current = current.next;
        }
        return str.toString();
    }

    public int size(){
        return this.size;
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
