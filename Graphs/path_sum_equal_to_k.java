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
    boolean result=false;
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        add(root,targetSum);
        return result;
        
        
    }
    public void add(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        sum+=root.val;
        if(root.left==null && root.right==null && sum== targetSum){
            result=true;
            return;
        }
        add(root.left,targetSum);
        add(root.right,targetSum);
        sum-=root.val;
    }
}
