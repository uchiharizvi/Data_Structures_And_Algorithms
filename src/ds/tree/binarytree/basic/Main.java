package ds.tree.binarytree.basic;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.root.left = new Node(5);
        binaryTree.root.right = new Node(6);
        System.out.println("Binary Tree Created");
    }
}
