package yandex.trees;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

public class SymTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode symroot = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(3)));
        TreeNode notSymRoot = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));

        TreeNode notSymRoot2 = new TreeNode(1,
                new TreeNode(2), new TreeNode(3));

        System.out.println(isSymmetric(symroot));
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode currentLeft = root.left;
        TreeNode currentRight = root.right;
        while (currentLeft != null && currentRight != null ){
            if (currentLeft.val != currentRight.val) return false;
            if (currentLeft.left.val != currentRight.right.val || currentLeft.right.val != currentRight.left.val) return false;
            currentLeft = currentLeft.left;
            currentRight = currentRight.right;
        }
        return true;
    }
}
