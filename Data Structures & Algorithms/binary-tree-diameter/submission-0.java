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
    int maxEdges = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return maxEdges;
        
    }
    public int findDiameter(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = findDiameter(root.left);
        int right = findDiameter(root.right);

        int currentMax = 1 + Math.max(left, right);

        maxEdges = Math.max(left + right, maxEdges);

        return currentMax;
    }
}
