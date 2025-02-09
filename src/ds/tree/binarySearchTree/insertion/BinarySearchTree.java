package ds.tree.binarySearchTree.insertion;


class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
            if(root!=null) {
                inOrderRec(root.left);
                System.out.println(root.data + " ");
                inOrderRec(root.right);
            }
        }

}
