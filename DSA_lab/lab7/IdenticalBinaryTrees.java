// 7. Write a Java program to check if two binary trees are identical

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class IdenticalBinaryTrees {
    TreeNode root1, root2;

    boolean isIdentical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;

        if (t1 == null || t2 == null)
            return false;

        return (t1.data == t2.data) &&
               isIdentical(t1.left, t2.left) &&
               isIdentical(t1.right, t2.right);
    }

    public static void main(String[] args) {
        IdenticalBinaryTrees tree = new IdenticalBinaryTrees();

        tree.root1 = new TreeNode(1);
        tree.root1.left = new TreeNode(2);
        tree.root1.right = new TreeNode(3);

        tree.root2 = new TreeNode(1);
        tree.root2.left = new TreeNode(2);
        tree.root2.right = new TreeNode(3);

        if (tree.isIdentical(tree.root1, tree.root2))
            System.out.println("Both binary trees are identical");
        else
            System.out.println("Both binary trees are not identical");
    }
}