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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result  = new ArrayList<>();
        inorderDFS(root , result);
        return result;

    }

    public void inorderDFS (TreeNode root , ArrayList<Integer>result){
        if(root == null) return;

        inorderDFS(root.left, result);
        result.add(root.val);
        inorderDFS(root.right, result);

    }


    }
