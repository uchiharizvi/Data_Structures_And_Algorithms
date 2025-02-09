package ds.tree.binarySearchTree.traversal.inorder;

public class RecursiveInOrder {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.inOrder();
    }
}
