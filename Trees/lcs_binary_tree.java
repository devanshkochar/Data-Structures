/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List <List<TreeNode>> R= new ArrayList<>();
    List <TreeNode> l=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       helper(p,root);
        l.clear();
        helper(q,root);
       
        for(int i=Math.min(R.get(0).size(),R.get(1).size())-1;i>=0;i--){
            if(R.get(0).get(i)==R.get(1).get(i)){ 
                return R.get(0).get(i);    
            }
            
            
            
        }
        return null;
        
    }
    public void helper(TreeNode x, TreeNode root){
        if (root==null){return ;}
        l.add(root);
        if(x.val==root.val){
            List<TreeNode> lcopy=new ArrayList<>();
            lcopy.addAll(l);
            R.add(lcopy);
         return;
        }
        helper(x,root.left);
        helper(x,root.right);
        l.remove(l.size()-1);
        return;
        
            
    }
}