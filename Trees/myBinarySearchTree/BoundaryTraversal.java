import java.util.ArrayList;

public class BoundaryTraversal {
    void traverseLeaf(Node root, ArrayList<Integer> result) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            result.add(root.data);
        }
        traverseLeaf(root.left, result);
        traverseLeaf(root.right, result);
    }

    void traverseLeft(Node root, ArrayList<Integer> result) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        result.add(root.data);

        if (root.left != null) {
            traverseLeft(root.left, result);
        } else {
            traverseLeft(root.right, result);
        }
    }

    void traverseRightInRev(Node root, ArrayList<Integer> result) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        if (root.right != null) {
            traverseRightInRev(root.right, result);
        } else {
            traverseRightInRev(root.left, result);
        }

        result.add(root.data);
    }

    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (node == null)
            return result;

        result.add(node.data); // Root
        traverseLeft(node.left, result); // Left

        traverseLeaf(node.left, result); // Leaf left
        traverseLeaf(node.right, result); // Leaf right

        traverseRightInRev(node.right, result);

        return result;

    }
}
