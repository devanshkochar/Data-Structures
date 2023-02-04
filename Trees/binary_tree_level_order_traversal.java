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
        List<List<Integer>> r=new ArrayList<>();
        if(root==null)return r;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int size=q.size();
            List <Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x=q.poll();
                l.add(x.val);
            if(x.left!=null){
                q.add(x.left);
            }
            if(x.right!=null){
                q.add(x.right);
            }
            }
            r.add(l); 
                
        }
        return r;
        
    }
}
