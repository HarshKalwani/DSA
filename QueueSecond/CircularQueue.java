package QueueSecond;

public class CircularQueue {
    private int front;
    private int rear;
    private int items[];
    private int size;
    private int count;


    public CircularQueue(int k){
        this.items = new int[k];
        this.count=0;
        this.front=-1;
        this.rear=0;
        this.size=k;
    }

    public boolean enqueue(int n){
        if(isFull()) return false;
        items[rear] = n;
        rear = (rear+1)%size;
        count++;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()) return false;
        front = (front +1) % size;
        count--;
        return true;
    }

    public int Front(){
        if(isEmpty()) return -1;
        return items[(front+1) % size];
    }

    public int Rear(){
        if(isEmpty()) return -1;
        int lastIndex = rear-1;
        if(lastIndex==-1) lastIndex=size-1;
        return items[lastIndex];
    }

    public boolean isFull(){
        return count==size;
    }

    public boolean isEmpty(){
        return count==0;
    }
}
