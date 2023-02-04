class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root!=null)
        {
            if(root.val==val)
            {
                System.out.println(root.val);
                return root;
            }

            else 
            {
                TreeNode r = root;
                if(root.left!=null && root.right!=null)
                {
                    r =  searchBST(root.left,val);
                    if(r==null)
                    {
                        System.out.println("Going here");
                        r =  searchBST(root.right,val);
                    }
                }
                else if(root.left!=null && root.right==null)
                {
                    r =  searchBST(root.left,val);
                }
                else if(root.left==null && root.right!=null)
                {
                    r =  searchBST(root.right,val);
                }
                else if(root.left==null && root.right==null)
                {
                    r =  null;
                }
                
                return r;
            }

        }
        return null;        
    }
}