package QueueSecond;

import java.util.Queue;

public class RevQueueViaRecursion {
    public Queue<Integer> rev(Queue<Integer> q){
        if(q.isEmpty() || q.size()==1) return q;

        int front = q.poll();
        q=rev(q);
        q.offer(front);
        return q;
    }
}
