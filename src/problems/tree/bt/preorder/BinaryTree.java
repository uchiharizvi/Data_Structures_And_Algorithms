package problems.tree.bt.preorder;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void preOrder() {
        preOrderRec(root);
    }
    private void preOrderRec(Node root) {
        if(root != null) {
            System.out.println(root.key);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}
