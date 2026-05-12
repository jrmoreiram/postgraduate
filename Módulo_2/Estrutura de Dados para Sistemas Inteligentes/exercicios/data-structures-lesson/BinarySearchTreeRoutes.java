public class BinarySearchTreeRoutes {

    // Class representing a tree node
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Visit method - displays the node's value
    static void visit(Node node) {
        System.out.print(node.value + " ");
    }

    // In-Order Traversal (Left -> Root -> Right)
    static void inOrder(Node bst) {
        if (bst != null) {
            inOrder(bst.left);
            visit(bst);
            inOrder(bst.right);
        }
    }

    // Post-Order Traversal (Left -> Right -> Root)
    static void postOrder(Node bst) {
        if (bst != null) {
            postOrder(bst.left);
            postOrder(bst.right);
            visit(bst);
        }
    }

    // Pre-Order Traversal (Root -> Left -> Right)
    static void preOrder(Node bst) {
        if (bst != null) {
            visit(bst);
            preOrder(bst.left);
            preOrder(bst.right);
        }
    }

    // Method to insert a node into the BST
    static Node insert(Node bst, int value) {
        if (bst == null) {
            return new Node(value);
        }
        if (value < bst.value) {
            bst.left = insert(bst.left, value);
        } else if (value > bst.value) {
            bst.right = insert(bst.right, value);
        }
        return bst;
    }

    public static void main(String[] args) {
        Node root = null;

        // Inserting values into the tree
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) {
            root = insert(root, v);
        }

        System.out.println("=== Binary Search Tree Traversals ===\n");

        System.out.print("In-Order   (Left -> Root -> Right): ");
        inOrder(root);
        System.out.println();

        System.out.print("Post-Order (Left -> Right -> Root): ");
        postOrder(root);
        System.out.println();

        System.out.print("Pre-Order  (Root -> Left -> Right): ");
        preOrder(root);
        
				System.out.println("\n\n Generated Tree:");
        System.out.println("          50");
        System.out.println("         /  \\");
        System.out.println("       30    70");
        System.out.println("      / \\   / \\");
        System.out.println("     20 40 60 80");
				
    }
}