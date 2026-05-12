import java.util.Scanner;

// Class representing the binary tree node (BIntNo)
class BIntNode {
    int value;
    BIntNode left, right;

    public BIntNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree Class
class BinaryTree {
    private BIntNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Recursive insertion method
    private BIntNode insert(BIntNode tree, int newValue) {
        if (tree == null) {
            return new BIntNode(newValue);
        } else {
            if (newValue < tree.value) {
                tree.left = insert(tree.left, newValue);
            } else {
                tree.right = insert(tree.right, newValue);
            }
        }
        return tree;
    }

    // Public method to insert a new value
    public void insertNode(int newValue) {
        root = insert(root, newValue);
    }

    // Displays nodes on the left (in-order traversal)
    private void displayLeft(BIntNode tree) {
        if (tree != null) {
            displayLeft(tree.left);
            System.out.print(tree.value + " ");
        }
    }

    public void displayLeftNode() {
        displayLeft(root);
    }

    // Displays nodes on the right
    private void displayRight(BIntNode tree) {
        if (tree != null) {
            displayRight(tree.right);
            System.out.print(tree.value + " ");
        }
    }

    public void displayRightNode() {
        displayRight(root);
    }

    // Displays the root value
    public void displayRoot() {
        if (root != null) {
            System.out.println("Root: " + root.value);
        }
    }

    // General display method
    public void displayNodes() {
        System.out.print("Left (in-order): ");
        displayLeftNode();
        System.out.println();
        displayRoot();
        System.out.print("Right (in-order): ");
        displayRightNode();
        System.out.println();
    }

    // Method to remove/handle a node by value (based on the "No" module)
    public void removeNode(int item) {
        BIntNode tempNode, parent, child, temp;

        tempNode = root;
        parent = null;
        child = root;

        // Search for the node to be removed
        while (tempNode != null && tempNode.value != item) {
            parent = tempNode;
            if (item < tempNode.value) {
                tempNode = tempNode.left;
            } else {
                tempNode = tempNode.right;
            }
        }

        if (tempNode == null) {
            System.out.println("Item not found!");
            return;
        }

        // Case: Node to remove is the root (parent == null)
        if (parent == null) {
            if (tempNode.right == null) {
                root = tempNode.left;
            } else if (tempNode.left == null) {
                root = tempNode.right;
            } else {
                // Node has two children
                temp = tempNode;
                child = tempNode.left;
                while (child.right != null) {
                    temp = child;
                    child = child.right;
                }
                if (child != tempNode.left) {
                    temp.right = child.left;
                    child.left = root.left;
                }
                child.right = root.right;
                root = child;
            }
        } else {
            // Case: Node to remove is not the root
            if (tempNode.right == null) {
                if (parent.left == tempNode) {
                    parent.left = tempNode.left;
                } else {
                    parent.right = tempNode.left;
                }
            } else if (tempNode.left == null) {
                if (parent.left == tempNode) {
                    parent.left = tempNode.right;
                } else {
                    parent.right = tempNode.right;
                }
            } else {
                // Node has two children
                temp = tempNode;
                child = tempNode.left;
                while (child.right != null) {
                    temp = child;
                    child = child.right;
                }
                if (child != tempNode.left) {
                    temp.right = child.left;
                    child.left = tempNode.left;
                }
                child.right = tempNode.right;
                if (parent.left == tempNode) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }
        }
    }
}

// Main Test Class
public class ApplicationsOfBinaryTreesInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        BinaryTree tree = new BinaryTree();

        System.out.println("Enter 5 integers to insert into the tree:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                tree.insertNode(num);
            }
        }

        System.out.println("\n--- Tree Display ---");
        tree.displayNodes();

        scanner.close();
    }
}