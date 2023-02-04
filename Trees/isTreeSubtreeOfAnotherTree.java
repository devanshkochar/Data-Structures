class Solution {
    public boolean identical(TreeNode s, TreeNode t)
    {
        if(s==null && t==null)
        {
            return true;
        }
        if(s==null || t==null)
        {
            return false;
        }
        if(s.val==t.val)
        {
            return (identical(s.left,t.left) && identical(s.right,t.right));
        }
        return false;
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(t==null)
        {
            return true;
        }
        if(s==null)
        {
            return false;
        }
        if(identical(s,t))
        {
            return true;
        }
        return(isSubtree(s.left,t)||isSubtree(s.right,t));
            
        
    }
}