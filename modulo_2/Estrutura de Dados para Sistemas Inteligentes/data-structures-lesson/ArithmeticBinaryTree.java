public class ArithmeticBinaryTree {

    // Node class - stores operator or numeric value as String
    static class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // Checks if a node is an operator
    static boolean isOperator(String value) {
        return value.equals("+") || value.equals("-")
            || value.equals("*") || value.equals("/");
    }

    // Evaluates the arithmetic tree recursively
    static double evaluate(Node node) {
        if (node == null) return 0;

        // Leaf node = operand (number)
        if (!isOperator(node.value)) {
            return Double.parseDouble(node.value);
        }

        double leftVal  = evaluate(node.left);
        double rightVal = evaluate(node.right);

        switch (node.value) {
            case "+": return leftVal + rightVal;
            case "-": return leftVal - rightVal;
            case "*": return leftVal * rightVal;
            case "/": return leftVal / rightVal;
            default:  return 0;
        }
    }

    // Pre-Order  -> Prefix  expression (Root -> Left -> Right)
    static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // In-Order   -> Infix   expression (Left -> Root -> Right)
    static void inOrder(Node node) {
        if (node != null) {
            if (isOperator(node.value)) System.out.print("( ");
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
            if (isOperator(node.value)) System.out.print(") ");
        }
    }

    // Post-Order -> Postfix expression (Left -> Right -> Root)
    static void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {

        /*
         * Expression: (3 + 5) * (8 - 2) / 4
         *
         * Result: (3 + 5) * (8 - 2) / 4
         *       =    8    *    6    / 4
         *       =         48        / 4
         *       =         12
         *
         * Tree structure:
         *
         *            /
         *           / \
         *          *   4
         *         / \
         *        +   -
         *       / \ / \
         *      3  5 8  2
         */

        // Build the tree manually
        Node root        = new Node("/");
        root.right       = new Node("4");

        root.left        = new Node("*");
        root.left.left   = new Node("+");
        root.left.right  = new Node("-");

        root.left.left.left   = new Node("3");
        root.left.left.right  = new Node("5");
        root.left.right.left  = new Node("8");
        root.left.right.right = new Node("2");

        // Print tree structure
        System.out.println("==========================================");
        System.out.println("       ARITHMETIC BINARY TREE");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("  Expression: (3 + 5) * (8 - 2) / 4");
        System.out.println();
        System.out.println("            /        ");
        System.out.println("           / \\       ");
        System.out.println("          *   4      ");
        System.out.println("         / \\         ");
        System.out.println("        +   -        ");
        System.out.println("       / \\ / \\       ");
        System.out.println("      3  5 8  2      ");
        System.out.println();

        // Traversals
        System.out.println("==========================================");
        System.out.println("  TRAVERSALS");
        System.out.println("==========================================");

        System.out.print("  Pre-Order  (Prefix) : ");
        preOrder(root);
        System.out.println();

        System.out.print("  In-Order   (Infix)  : ");
        inOrder(root);
        System.out.println();

        System.out.print("  Post-Order (Postfix): ");
        postOrder(root);
        System.out.println();

        // Result
        System.out.println();
        System.out.println("==========================================");
        System.out.println("  RESULT");
        System.out.println("==========================================");
        System.out.println("  (3 + 5) * (8 - 2) / 4 = " + (int) evaluate(root));
        System.out.println("==========================================");
    }
}