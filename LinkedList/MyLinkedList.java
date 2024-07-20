package LinkedList;

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
