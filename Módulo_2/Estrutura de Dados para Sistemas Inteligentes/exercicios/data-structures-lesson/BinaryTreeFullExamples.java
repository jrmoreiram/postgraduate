public class BinaryTreeFullExamples {

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

    static void visit(Node node) {
        System.out.print(node.value + " ");
    }

    static void inOrder(Node bst) {
        if (bst != null) {
            inOrder(bst.left);
            visit(bst);
            inOrder(bst.right);
        }
    }

    static void postOrder(Node bst) {
        if (bst != null) {
            postOrder(bst.left);
            postOrder(bst.right);
            visit(bst);
        }
    }

    static void preOrder(Node bst) {
        if (bst != null) {
            visit(bst);
            preOrder(bst.left);
            preOrder(bst.right);
        }
    }

    static Node insert(Node bst, int value) {
        if (bst == null) return new Node(value);
        if (value < bst.value) bst.left = insert(bst.left, value);
        else if (value > bst.value) bst.right = insert(bst.right, value);
        return bst;
    }

    static void printTraversals(Node root) {
        System.out.print("  In-Order  : "); inOrder(root);   System.out.println();
        System.out.print("  Pre-Order : "); preOrder(root);  System.out.println();
        System.out.print("  Post-Order: "); postOrder(root); System.out.println();
    }

    // 1. ARVORE BINARIA CHEIA (Full Binary Tree)
    //    Todo no tem 0 ou 2 filhos
    //
    //         1
    //        / \
    //       2   3
    //      / \
    //     4   5
    static Node fullBinaryTree() {
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right = new Node(5);
        return root;
    }

    // 2. ARVORE BINARIA PERFEITA (Perfect Binary Tree)
    //    Todos os nos internos tem 2 filhos e
    //    todas as folhas estao no mesmo nivel
    //
    //         1
    //        / \
    //       2   3
    //      / \ / \
    //     4  5 6  7
    static Node perfectBinaryTree() {
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left   = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    // 3. ARVORE BINARIA COMPLETA (Complete Binary Tree)
    //    Todos os niveis preenchidos exceto o ultimo,
    //    que e preenchido da esquerda para a direita
    //
    //         1
    //        / \
    //       2   3
    //      / \ /
    //     4  5 6
    static Node completeBinaryTree() {
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        return root;
    }

    // 4. ARVORE BINARIA BALANCEADA (AVL-like)
    //    Diferenca de altura entre subarvores <= 1
    //
    //         10
    //        /  \
    //       5    20
    //      / \     \
    //     3   7    25
    static Node balancedBinaryTree() {
        Node root  = new Node(10);
        root.left  = new Node(5);
        root.right = new Node(20);
        root.left.left   = new Node(3);
        root.left.right  = new Node(7);
        root.right.right = new Node(25);
        return root;
    }

    // 5. ARVORE DEGENERADA (Degenerate / Skewed Tree)
    //    Cada no tem apenas um filho - comporta-se
    //    como uma lista encadeada
    //
    //    1
    //     \
    //      2
    //       \
    //        3
    //         \
    //          4
    static Node degenerateTree() {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);
        return root;
    }

    // 6. ARVORE BINARIA DE BUSCA (BST)
    //    Esquerda < Raiz < Direita
    //
    //         50
    //        /  \
    //       30   70
    //      / \   / \
    //     20 40 60 80
    static Node binarySearchTree() {
        Node root = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            root = insert(root, v);
        }
        return root;
    }

    // 7. ARVORE ESTRITAMENTE BINARIA
    //    Todo no nao-folha tem exatamente 2 filhos
    //    (igual a Full, mas enfatizando a obrigatoriedade)
    //
    //           1
    //          / \
    //         2   3
    //        / \ / \
    //       4  5 6  7
    //      / \
    //     8   9
    static Node strictlyBinaryTree() {
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left   = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left  = new Node(8);
        root.left.left.right = new Node(9);
        return root;
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("    EXEMPLOS DE ARVORES BINARIAS");
        System.out.println("==========================================\n");

        System.out.println("-- 1. ARVORE CHEIA (Full Binary Tree) ------");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\");
        System.out.println("   4   5");
        printTraversals(fullBinaryTree());

        System.out.println("\n-- 2. ARVORE PERFEITA (Perfect Binary Tree) -");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\ / \\");
        System.out.println("   4  5 6  7");
        printTraversals(perfectBinaryTree());

        System.out.println("\n-- 3. ARVORE COMPLETA (Complete Binary Tree) -");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\ /");
        System.out.println("   4  5 6");
        printTraversals(completeBinaryTree());

        System.out.println("\n-- 4. ARVORE BALANCEADA (Balanced) ----------");
        System.out.println("        10");
        System.out.println("       /  \\");
        System.out.println("      5    20");
        System.out.println("     / \\     \\");
        System.out.println("    3   7    25");
        printTraversals(balancedBinaryTree());

        System.out.println("\n-- 5. ARVORE DEGENERADA (Skewed) ------------");
        System.out.println("   1");
        System.out.println("    \\");
        System.out.println("     2");
        System.out.println("      \\");
        System.out.println("       3");
        System.out.println("        \\");
        System.out.println("         4");
        printTraversals(degenerateTree());

        System.out.println("\n-- 6. ARVORE BINARIA DE BUSCA (BST) ---------");
        System.out.println("          50");
        System.out.println("         /  \\");
        System.out.println("       30    70");
        System.out.println("      / \\   / \\");
        System.out.println("     20 40 60 80");
        printTraversals(binarySearchTree());

        System.out.println("\n-- 7. ARVORE ESTRITAMENTE BINARIA -----------");
        System.out.println("           1");
        System.out.println("          / \\");
        System.out.println("         2   3");
        System.out.println("        / \\ / \\");
        System.out.println("       4  5 6  7");
        System.out.println("      / \\");
        System.out.println("     8   9");
        printTraversals(strictlyBinaryTree());
    }
}