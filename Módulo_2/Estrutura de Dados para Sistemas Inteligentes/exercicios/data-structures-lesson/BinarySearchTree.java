import javax.swing.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insertNode(int value) {
        root = insertRecursive(root, value);
    }

    Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    void displayNode() {
        StringBuilder sb = new StringBuilder();
        sb.append("In-order traversal (sorted):\n");
        inOrder(root, sb);
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    void inOrder(Node node, StringBuilder sb) {
        if (node != null) {
            inOrder(node.left, sb);
            sb.append(node.value).append("\n");
            inOrder(node.right, sb);
        }
    }
}

class BinarySearchTree {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        tree.insertNode(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")));
        tree.insertNode(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")));
        tree.insertNode(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")));
        tree.insertNode(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")));
        tree.insertNode(Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")));

        tree.displayNode();

        System.exit(0);
    }
}