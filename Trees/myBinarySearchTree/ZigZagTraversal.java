import java.util.*;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();
        if(root==null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean isLeft = true;

        while(!q.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            int size = q.size();

            for(int i = 0 ; i < size ; i++){
                TreeNode currentNode = q.poll();
                if(isLeft){
                    temp.add(currentNode.data);
                }else{
                    temp.add(0,currentNode.data);
                }

                if(currentNode.leftChild !=null){
                    q.offer(currentNode.leftChild);
                }

                if(currentNode.rightChild!=null){
                    q.offer(currentNode.rightChild);
                }
            }
            result.add(temp);
            isLeft = !isLeft;
        }
        return result;
    }
}
