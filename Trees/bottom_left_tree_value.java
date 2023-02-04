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
    Map<Integer,List<Integer>> m=new TreeMap<>();
    public int findBottomLeftValue(TreeNode root) {
        updateMap(0,root);
        return m.get(m.size()).get(0);
        
        
    }
    public void updateMap(int level, TreeNode root){
        if(root==null){
            return;
        }
        level++;
        if(m.containsKey(level)){
            m.get(level).add(root.val);
        }
        else{
            List<Integer> l=new ArrayList<>();
            l.add(root.val);
            m.put(level,l);
            
        }
        updateMap(level,root.left);
        updateMap(level,root.right);
    }
    
}