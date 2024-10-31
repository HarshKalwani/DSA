class Pair{
    boolean isBalanced;
    int height;
    public Pair(boolean isBalanced , int height){
        this.isBalanced = isBalanced;
        this.height = height;
    }
}

public class BalancedTreeOrNot {
    Pair isBalancedFast(Node root){
        if(root == null) return new Pair(true, 0);
        Pair left = isBalancedFast(root.left);
        Pair right = isBalancedFast(root.right);

        int balanceFactor = Math.abs(left.height - right.height);
        int myHeight = Math.max(left.height , right.height) +1;

        if(left.isBalanced && right.isBalanced && balanceFactor <=1) return new Pair(true, myHeight);

        return new Pair(false,myHeight);
    }

    boolean isBalanced(Node root){
        return isBalancedFast(root).isBalanced;
    }
}


//Simple way 
// private int getHeight(Node root){
    //     if(root == null) return 0;
    //     return Math.max(getHeight(root.left) , getHeight(root.right)) +1 ;
    // }

    // boolean isBalanced(Node root)
    // {
	// Your code here
	   // if(root == null) return true;
	    
	   // boolean left= isBalanced(root.left);
	   // boolean right=isBalanced(root.right);
	    
	   // int myBalanceFactor = Math.abs(getHeight(root.left) - getHeight(root.right));
	    
	   // if(left && right && myBalanceFactor <= 1) return true;
	    
	   // return false;
   // }   