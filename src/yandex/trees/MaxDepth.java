package yandex.trees;


/**
 * Given the root of a binary tree, return its maximum depth.
 * In input we have given tree node values & in output we have to return it's maximum height.
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(5, null, null), new TreeNode(8, null, null));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
