class Node {
    int data;
    Node left, right;

    public Node(int key) {
        data = key;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Postorder
    void postorder(Node node) {
        if (node == null)
            return;
        // Left child
        postorder(node.left);
        // Right child
        postorder(node.right);
        System.out.print(node.data + "->");
    }

    // Inorder
    void inorder(Node node) {
        if (node == null)
            return;
        // Left child
        inorder(node.left);
        System.out.print(node.data + "->");
        // Right child
        inorder(node.right);
    }

    // Preorder
    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + "->");
        // Left child
        preorder(node.left);
        // Right child
        preorder(node.right);
    }

    // Main method
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(11);
        tree.root.left = new Node(12);
        tree.root.right = new Node(13);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(15);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println(); // To move to the next line

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println(); // To move to the next line

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
    }
}
