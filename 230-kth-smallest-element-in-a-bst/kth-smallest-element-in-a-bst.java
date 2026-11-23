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
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderDFS(root,k);
        return ans;

        
    }
    public void inorderDFS(TreeNode node, int k){
        if(node==null) return;
        inorderDFS(node.left,k);
        count++;
        if(count==k) {
            ans=node.val;
            return;
        }

        inorderDFS(node.right,k);
        
    }


}