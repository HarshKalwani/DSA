public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree tree2 = new BinarySearchTree();
        // tree.insert(7);
        // tree.insert(1);
        // tree.insert(8);

        int[] numbers = new int[]{7,3,9,1,4,8,10};
        for(int num : numbers){
            tree.insert(num);
        }

        int[] numbers2 = new int[]{7,3,9,1,4,8,10};

        for(int nums : numbers2){
            tree2.insert(nums);
        }

        // tree.preOrderTraverse();
        // tree.inOrderTraverse();
        tree.postOrderTraverse();
        // System.out.println(tree.getMin());

        System.out.println(tree.isEqual(tree2));
    }
}
