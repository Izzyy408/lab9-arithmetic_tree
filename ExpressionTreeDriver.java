public class ExpressionTreeDriver {
    public static void main(String[] args) {

        // 1. Create the root and operators
        BinaryTreeNode root = new BinaryTreeNode("*");

        BinaryTreeNode nodePlus = new BinaryTreeNode("+");
        BinaryTreeNode nodeMinus = new BinaryTreeNode("-");

        // 2. Connect the operators to the root
        root.left = nodePlus;
        root.right = nodeMinus;

        nodePlus.parent = root;
        nodeMinus.parent = root;

        // 3. Create the operand nodes
        BinaryTreeNode node3 = new BinaryTreeNode("3");
        BinaryTreeNode node7 = new BinaryTreeNode("7");
        BinaryTreeNode node9 = new BinaryTreeNode("9");
        BinaryTreeNode node4 = new BinaryTreeNode("4");

        // 4. Connect operands to the plus operator
        nodePlus.left = node3;
        nodePlus.right = node7;

        node3.parent = nodePlus;
        node7.parent = nodePlus;

        // 5. Connect operands to the minus operator
        nodeMinus.left = node9;
        nodeMinus.right = node4;

        node9.parent = nodeMinus;
        node4.parent = nodeMinus;

        // 6. Perform preorder traversal
        System.out.println("--- Preorder Traversal (Prefix) ---");
        root.traversePreorder();

        // 7. Perform inorder traversal
        System.out.println("\n\n--- Inorder Traversal (Infix) ---");
        root.traverseInorder();

        // 8. Perform postorder traversal
        System.out.println("\n\n--- Postorder Traversal (Postfix) ---");
        root.traversePostorder();

        System.out.println();
    }
}
