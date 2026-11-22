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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result  = new ArrayList<>();
        preorderDFS(root , result);
        return result;

    }

    public void preorderDFS (TreeNode root , ArrayList<Integer>result){
        if(root == null) return;
        result.add(root.val);

        preorderDFS(root.left, result);
        
        preorderDFS(root.right, result);

    }


    }
        
    
