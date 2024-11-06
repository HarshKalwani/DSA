import java.util.*;

class Pair{
    int x;
    Node node;

    public Pair(Node node, int x){
        this.x = x;
        this.node = node;
    }
}
public class VerticalTreeTraversal {
    static ArrayList<Integer> verticalOrder(Node root){
        ArrayList<Integer>result = new ArrayList<>();
        if(root == null) return result;

        Queue<Pair>q = new LinkedList<>();
        Map<Integer , ArrayList<Integer>> map = new TreeMap<>();

        q.offer(new Pair(root ,0));

        while (!q.isEmpty()) {
            Pair currentPair = q.poll();
            if(!map.containsKey(currentPair.x)){
                map.put(currentPair.x, new ArrayList<>());
            }

            map.get(currentPair.x).add(currentPair.node.data);

            if(currentPair.node.left !=null){
                q.offer(new Pair(currentPair.node.left, currentPair.x-1));
            }

            if(currentPair.node.right !=null){
                q.offer(new Pair(currentPair.node.right, currentPair.x+1));
            }
        }

        for(var entry : map.entrySet()){
            for(var num : entry.getValue()){
                result.add(num);
            }
        }

        return result;
    }
}
