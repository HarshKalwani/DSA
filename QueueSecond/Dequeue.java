public class Dequeue {
    private int[] items;
    private int front;
    private int rear;
    private int count;
    private int size; 

    public Dequeue(int n){
        this.items = new int[n];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.size = n;
    }

    public boolean pushRear(int value){
        if(isFull()) return false;
        items[rear]=value;
        rear = (rear+1)%size;
        count++;
        return true;
    }

    public boolean pushFront(int value){
        if(isFull()) return false;
        front--;
        if(front==-1) front = size-1;
        items[front]=value;
        count++;
        return true;
    }

    public int popRear(){
        if(isEmpty()) return -1;
        rear--;
        if(rear==-1) rear = size-1;
        count--;
        return items[rear];
    }

    public int popFront(){
        if(isEmpty()) return -1;
        int value = items[front];
        front = (front+1) % size;
        count--;
        return value;
    }

    public int getFront(){
        if(isEmpty()) return -1;
        return items[front];
    }

    public int getRear(){
        if(isEmpty()) return -1;
        int rearIndex = rear-1;
        if(rearIndex == -1) rearIndex = size-1;
        return items[rearIndex];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean isFull(){
        return count == size;
    }
}
