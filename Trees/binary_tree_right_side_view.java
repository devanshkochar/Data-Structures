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
    Map <Integer,List<Integer>> h=new TreeMap<>();
    List<Integer> x=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        updateMap(0,root);
        for (Map.Entry e:h.entrySet()){
            List<Integer> a=(ArrayList)e.getValue();
            x.add(a.get(a.size()-1));
            
        }
        return x;
        
    }
        
   
        public void updateMap(int level,TreeNode root){
            if(root==null){return;}
            level++;
            if(h.containsKey(level)){
                h.get(level).add(root.val);
            }else{
                 List <Integer> l=new ArrayList<>();
                l.add(root.val);
                h.put(level,l);
            }
            updateMap(level,root.left);
            updateMap(level,root.right);
            return;
        }
        
        
    
}