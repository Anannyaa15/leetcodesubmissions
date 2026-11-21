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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return ans;

        
    }
    public int maxSum(TreeNode node){
        if(node==null) return 0;

        int left = Math.max(maxSum(node.left), 0);
        int right = Math.max(maxSum(node.right), 0);
        int pathSum = node.val + left + right;

        ans = Math.max(ans, pathSum);
        return node.val + Math.max(left,right);

    }
}