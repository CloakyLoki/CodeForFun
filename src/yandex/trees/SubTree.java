package yandex.trees;

/*
 *Given the roots of two binary trees root and subRoot,
 * return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 *  A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants.
 * The tree  could also be considered as a subtree of itself.
 *
 *  Example 1:
 *  Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 *  Output: true
 *
 *  Example 2:
 *  Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 *  Output: false
 */






public class SubTree {
    public static class TreeNode {
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

}
