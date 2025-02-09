package ds.tree;

public class TreeUtils {
    public static Node buildTree() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right = new Node(3);
        node.right.right = new Node(6);
        return node;
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = right = null;
    }
}
