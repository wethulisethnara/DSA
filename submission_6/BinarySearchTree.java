package submission_6;

public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
        public Node(int item) { key = item; left = right = null; }
    }
    
    private Node root;

    public void insert(int key) { root = insertRec(root, key); }

    private Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }
}

