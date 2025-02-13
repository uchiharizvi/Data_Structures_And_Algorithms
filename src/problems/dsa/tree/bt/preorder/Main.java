package problems.dsa.tree.bt.preorder;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(buildTree());
        binaryTree.preOrder();
    }

    private static Node buildTree() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right = new Node(3);
        node.right.right = new Node(6);
        return node;
    }
}
