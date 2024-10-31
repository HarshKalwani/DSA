class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair{
    int dia;
    int height;
    public Pair(int dia , int height){
        this.height = height;
        this.dia= dia;
    }
}
public class DiameterOfTree {
    private Pair diameterFast(Node root ){
        if(root == null) return new Pair(0,0);

        Pair left = diameterFast(root.left);
        Pair right = diameterFast(root.right);
        int myDia = left.height + right.height +1;
        int result = Math.max(left.dia , Math.max(right.dia , myDia));
        int myHeight = Math.max(left.height, right.height) +1;
        return new Pair(result, myHeight);
    }

    int diameter(Node root){
        return diameterFast(root).dia;
    }
}
