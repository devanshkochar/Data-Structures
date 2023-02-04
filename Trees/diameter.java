class Solution {
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld = height(root.left);
        int rd = height(root.right);
        
        if(ld>rd)
        {
            return ld+1;
        }
        else
        {
            return rd+1;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int ld = height(root.left);
        int rd = height(root.right);
        
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        
        return Math.max(ld+rd,Math.max(l,r));
        
        
    }
}