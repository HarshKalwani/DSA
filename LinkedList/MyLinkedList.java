package LinkedList;

import java.util.HashSet;
import java.util.Set;

class Node{
    public int data;
    public Node next = null;
    public Node(int data){
        this.data=data;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int num){  //o(n) T.C as we traversing whole link list to find the element 
        Node node = new Node(num);
        if(head==null){ //Empty Linked List
            head=node;
            tail=node;
        }else{
            // Node current = head;
            // while(current.next !=null){
            //     current = current.next;  //move a step ahead and now the last element is current 
            // }
            // current.next = node;

            tail.next = node;
            tail=node; //updating tail to new node
        }
        
    }

    public int sum(){
        Node current = head ;
        int sum=0;
        while(current != null){
            sum+=current.data;
            current = current.next;
        }
        return sum;
    }

    public int indexOf(int value){
        int index = 0;
        Node current = head;
        while(current != null){
            if(current.data == value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
            insert(value);
            return;
        }

        node.next=head;
        head=node;
    }

    public boolean isEmpty(){
        return head==null && tail == null;
    }


    public void insertAt(int value , int index){
        if(isEmpty()) throw new IllegalArgumentException();
        Node node = new Node(value);
        Node current= head;
        Node prev=null;

        while (index > 0 && current !=null) {
            prev = current;
            current= current.next;
            index--;
        }

        prev.next = node;
        node.next = current;
    }

    public void reverse(){
        if(head ==null || head.next==null) return;
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(next!=null){
            current.next= prev;
            prev=current;
            current = next;
            next=next.next;
        }
        current.next= prev;
        head=current;
    }

    public void removeFromStart(){
        if(isEmpty()) return;

        Node temp = head;
        head=head.next;
        temp.next = null;
    }

    public void removeFromEnd(){
        if(isEmpty()) return;
        if(head==tail){
            head=tail=null;
            return;
        }

        Node current = head;
        while(current.next !=tail){
            current = current.next;

        }
        current.next=null;
        tail=current;
    }


    public void removeNthFromEndFast(int n){
        if(isEmpty()) return;
        if(head.next == null) {
            head=null;
            return;
        }

        Node fast = head;
        Node current = head;
        Node prev = null;

        while(n > 1 && fast !=null){
            fast = fast.next;
            n--;
        }

        while (fast.next !=null) {
            prev=current;
            current = current.next;
            fast=fast.next;
        }


        prev.next = current.next;
        current.next = null; //garbage collector by java 
    }


    public void removeNthFromEnd(int n){
        if(isEmpty()) return;
        if(head.next == null) {
            head=null;
            return;
        }

        Node current = head;
        int totalNodes = 0;
        while (current != null) {
            totalNodes++;
            current = current.next;
        }

        int indexFromFront = totalNodes - n +1;
        System.out.println(indexFromFront);

        Node prev= null;
        current=head;

        while (indexFromFront > 1 && current!=null) {
            indexFromFront--;
            prev=current;
            current = current.next;
        }

        if(prev == null){
            head = current.next;
            current.next=null;
        }

        prev.next = current.next;
        current.next = null;
    }


    public void printRec(Node head){
        if(head==null) return;

        System.out.print(head.data + "->");
        printRec(head.next);
        // System.out.print(head.data + "->");  //this one is for backtracking 
    }

    public void printRec(){
        printRec(head);
    }

    public Node swapNode(Node head){
        if(head == null || head.next == null) return head;

        Node remainingNode = swapNode(head.next.next);
        Node secNode = head.next;
        secNode.next = head;
        head.next = remainingNode;

        return secNode;
    }

    public void swapNode(){
        head=swapNode(head);
    }

    public Node revRecc(Node head){
        if(head == null || head.next == null) return head ; 
        Node rest = revRecc(head.next);
        Node next = head.next;

        next.next=head;
        head.next=null;

        return rest;
    }

    public void revRecc(){
        head = revRecc(head);
    }

    public Node reverseKGroup(Node head , int k){
        if(head == null || head.next == null) return head;

        int count = 0;
        Node current = head;
        Node prev=null;
        Node next = null;

        while(count < k && current !=null){
            current = current.next;
            count ++;
        } //to 3

        if(count < k) return head;  //for remaining Nodes 

        current = head;
        count = 0;

        while(count < k && current !=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
            count++;
        }


        if(next!=null){
            head.next = reverseKGroup(next, k);  //if current is at 3 then head will be at 2 so return prev;(kum smj aya ) 
        }

        return prev;

    }

    public boolean hasCycle(Node head){
        if(isEmpty())return false;

        Node slow =head;
        Node fast = head;

        while (fast!=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;

    }

    public Node middleOfLinkedList(Node head){
        if(isEmpty()) return null;

        Node slow =head;
        Node fast = head;

        while (fast!=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public Node removeLoopNode(Node head){
        if(isEmpty()) return head;
        
        Set<Node> log = new HashSet<>();
        Node current = head; 
        Node prev = null;

        log.add(current);

        while(current != null){
            prev = current;
            current = current.next;
            if(log.contains(current)){
                prev.next = null;
            }

            log.add((current));
        }
        return head;
    }


    public Node removeDuplicate(Node head){
        if(isEmpty()) return head;

        Node current = head; 
        while(current !=null && current.next != null){
            if(current.data == current.next.data){
                Node nexNode = current.next;
                current.next = nexNode.next;
                nexNode.next = null;
            }else{
                current = current.next;
            }
        }
    }


    public String toString(){
        Node current = head;
        StringBuilder result = new StringBuilder();

        while(current != null){
            result.append(current.data);
            if(current.next !=null){
                result.append("-->");
            }
            current = current.next;
        }

        return result.toString();
    }
}
