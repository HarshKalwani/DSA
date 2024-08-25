package Queues;


public class Deque 
{
    // Initialize your data structure.
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;
    public Deque(int n) 
    {
        // Write your code here.
        items = new int[n];
        front=0;
        rear=0;
        size=n;
        count=0;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        // Write your code here.
        if(isFull()) return false;
        front--;

        if(front==-1){
            front=size-1;
        }
        items[front]=x;
        count ++;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        // Write your code here.
        if(isFull()) return false;
        items[rear]=x;
        rear=(rear+1)%size;
        count++;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        // Write your code here.
        if(isEmpty()) return -1;
        int val = items[front];
        front = (front +1)%size;
        count --;
        return val;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if(isEmpty()) return -1;
        rear--;
        if(rear==-1){
            rear = size-1;
        }
        count--;
        return items[rear];
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        // Write your code here.
        if(isEmpty()) return -1;
        return items[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        // Write your code here.
        if(isEmpty()) return -1;
        int rearIndex = rear-1;
        if(rearIndex==-1){
            rearIndex=size-1;
        }
        return items[rearIndex];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
        return count ==0;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
        return count == size;
    }
}


// Problem statement
// Design a data structure to implement deque of size ‘N’. It should support the following operations:

// pushFront(X): Inserts an element X in the front of the deque. Returns true if the element is inserted, otherwise false.

// pushRear(X): Inserts an element X in the back of the deque. Returns true if the element is inserted, otherwise false.

// popFront(): Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.

// popRear(): Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.

// getFront(): Returns the first element of the deque. If the deque is empty, it returns -1.

// getRear(): Returns the last element of the deque. If the deque is empty, it returns -1.

// isEmpty(): Returns true if the deque is empty, otherwise false.

// isFull(): Returns true if the deque is full, otherwise false.

