package QueueSecond;

import java.util.Queue;

public class RevKElement {
    public Queue<Integer> reverseKElements(Queue<Integer> q , int k){
        if(q.isEmpty() || k <=0) return q;

        int front = q.poll();
        q = reverseKElements(q,k-1);
        q.offer(front);

        return q;
    }

    public Queue<Integer> modifyQueue(Queue<Integer> q , int k){
        q=reverseKElements(q, k);

        for(int i =0; i < q.size() -k; i++){
            q.offer(q.poll());
        }
        return q;
    }
}
