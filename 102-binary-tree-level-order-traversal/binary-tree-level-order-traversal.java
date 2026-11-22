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
    public List<List<Integer>> levelOrder(TreeNode root) {    
        List<List<Integer>> result  = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> visited = new LinkedList<>();

        visited.offer(root);
        while(!visited.isEmpty()){
            int levelSize = visited.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0; i<levelSize; i++){
                TreeNode currNode = visited.poll();
                currentLevel.add(currNode.val);
                if(currNode.left != null) visited.offer(currNode.left);
                if(currNode.right != null) visited.offer(currNode.right);

            }
            result.add(currentLevel);
        }
        return result;




        
    }
}