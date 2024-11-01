class Pair{
    boolean isSum;
    int sum;
    
    public Pair(boolean isSum , int sum){
        this.isSum = isSum;
        this.sum= sum;
    }
}

public class SumTreeOrNot {
    Pair isSumTree (Node root){
        if(root == null) return new Pair(true , 0);
        if(root.left == null && root.right == null) return new Pair(true, root.data);

        Pair left = isSumTree(root.left);
        if(!left.isSum) return left;

        Pair right = isSumTree(root.right);
        if(!right.isSum) return right;

        return new Pair(left.sum + right.sum == root.data, left.sum + right.sum + root.data);
    }

    boolean isSum(Node root){
        return isSumTree(root).isSum;
    }
}
