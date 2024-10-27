class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public String toString() {
        return "Value = " + this.data;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value <= root.data) {
            root.leftChild = insert(root.leftChild, value);
        } else {
            root.rightChild = insert(root.rightChild, value);
        }

        return root;
    }

    public void insert(int value) {

        root = insert(root, value);
        // TreeNode node = new TreeNode(value);

        // if(root == null) {
        // root = node;
        // return;
        // }

        // TreeNode current = root;
        // while (true) {
        // if(value <= current.data){ //GO left
        // if(current.leftChild == null){
        // current.leftChild = new TreeNode(value);
        // break;
        // }
        // current = current.leftChild;
        // }else{ //GO right
        // if(current.rightChild == null){
        // current.rightChild = new TreeNode(value);
        // break;
        // }
        // current = current.rightChild;
        // }
        // }
    }

    private TreeNode find(TreeNode root , int value){
        
        
        
        //find using loops 

        // TreeNode current = root;
        // while (current != null) {
        //     if (value == current.data) {
        //         return current;
        //     }
        //     else if(value < current.data){
        //         current = current.leftChild;
        //     }else{
        //         current = current.rightChild;
        //     }    
        // }
        // return null;
        
        //find via recursion 
        if(root == null) return null;
        if(root.data == value) return root;

        if(value < root.data){
            return find(root.leftChild, value);
        }

        return find(root.rightChild, value);

    }

    public TreeNode find(int value){
        return find(root,value);
    }


    private void preOrderTraverse(TreeNode root){
        if(root == null) return;

        //Pre-order:Root -> Left -> right
        System.out.println(root.data);  //root
        preOrderTraverse(root.leftChild); //left
        preOrderTraverse(root.rightChild); // right
    }

    public void preOrderTraverse(){
        preOrderTraverse(root);
    }

    private void inOrderTraverse(TreeNode root){
        if(root == null) return ;
        // In-Order : Left -> Root -> Right
        inOrderTraverse(root.leftChild);
        System.out.println(root.data);
        inOrderTraverse(root.rightChild);
    }
    
    public void inOrderTraverse(){
        inOrderTraverse(root);
    }

    private void postOrderTraverse(TreeNode root){
        if(root == null) return;

        //Post-Order : Left -> Right -> Root 
        postOrderTraverse(root.leftChild);
        postOrderTraverse(root.rightChild);
        System.out.println(root.data);
    }


    public void postOrderTraverse(){
        postOrderTraverse(root);
    }

    private int dept(TreeNode root , int value , int dept){
        if(root == null) return -1;

        if(root.data == value) return dept;

        if(value <=root.data){ //Left
            return dept(root.leftChild , value , dept+1);
        }

        return dept(root.rightChild , value , dept+1);
    }

    public int dept(int value){
        return dept(root , value , 0);
    }

    private int height(TreeNode root){
        if(root == null) return -1;

        if(root.leftChild == null && root.rightChild == null) return 0;

        int myHeight =1+ Math.max(height(root.leftChild), height(root.rightChild));

        return myHeight;

    }

    public int getHeightOfTree(){
        return height(root);
    }

    private int heightOfNode(TreeNode root , int value){
        if(root == null) return -1;
        if(root.data == value) return height(root);

        if(value <= root.data) return heightOfNode(root.leftChild, value);

        return heightOfNode(root.rightChild, value);
    }

    public int getHeightForNode(int value){
        return heightOfNode(root ,value);
    }

    private TreeNode getMin(TreeNode root){
        if(root == null) return null;

        if(root.leftChild == null) return root;

        return getMin(root.leftChild);
    }

    public TreeNode getMin(){
        return getMin(root);
    }

    private boolean isEqual(TreeNode r1 ,  TreeNode r2){
        if(r1 == null && r2 == null) return true;

        if(r1 == null) return false;
        if(r2 == null) return false;

        return r1.data == r2.data && 
            isEqual(r1.leftChild, r2.leftChild) &&
            isEqual(r1.rightChild, r2.rightChild);
    }

    public boolean isEqual(BinarySearchTree tree){
        return isEqual(root , tree.root);
    }

    private void nodesAtKDistance(TreeNode root, int k, List<Integer> result){
        if(k==0) {
            result.add(root.data);
            return;
        }

        nodesAtKDistance(root.leftChild, k-1, result);
        nodesAtKDistance(root.rightChild, k-1, result);
    }

    public List<Integer> nodesAtKDistance(int k ){
        List<Integer> result = new LinkedList<>();
        nodesAtKDistance(root , k, result);
    }
}