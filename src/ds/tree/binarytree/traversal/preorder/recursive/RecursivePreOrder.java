package ds.tree.binarytree.traversal.preorder.recursive;

import static ds.tree.TreeUtils.buildTree;

public class RecursivePreOrder {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(buildTree());
        binaryTree.preOrder();
    }
}
