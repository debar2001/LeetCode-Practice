/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);

        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;
        if(tempLeft==null) return;
        while (tempLeft.right != null) tempLeft = tempLeft.right;

        tempLeft.right = tempRight;
        root.right = root.left;
        root.left=null;
    }
}