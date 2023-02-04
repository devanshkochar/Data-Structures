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
    public int minValue(TreeNode root)
    {
        int min = root.left.val;
        while(root.left!=null)
        {
            min = root.left.val;
            root=root.left;
        }
        return min;
    }
    public TreeNode deleteRoot(TreeNode root, int x)
    {
        if(x<root.val)
        {
            root.left = deleteRoot(root.left,x);
        }
        if(x>root.val)
        {
            root.right = deleteRoot(root.right,x);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
        
            root.val = minValue(root.right);
        
            root.right = deleteRoot(root.right,x);
        }
        
        return root;
        
    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)
        {
            return null;
        }
        
        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);
        
        if(root.val<L || root.val>R)
        {
            int x = root.val;
            root = deleteRoot(root,x);
        }
        
        return root;
        
    }
}