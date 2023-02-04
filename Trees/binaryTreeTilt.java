class Solution {
    public int count(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int c=0;
        c+=root.val;
        c+=count(root.left);
        c+=count(root.right);
        
        return c;
    }
    public ArrayList<Integer> find(TreeNode root, ArrayList<Integer> l)
    {
        if(root==null)
        {
            return l;
        }
        else if(root.left==null && root.right==null)
        {
            l.add(0);
        }
        else if(root.left!=null && root.right==null)
        {
            l.add(count(root.left));
        }
        else if(root.left==null && root.right!=null)
        {
            l.add(0-count(root.right));
        }
        else
        {
            System.out.println(count(root.left));
            l.add(count(root.left)-count(root.right));
        }
        l=find(root.left,l);
        l=find(root.right,l);
        
        return l;
        
    }
    public int findTilt(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a = find(root,a);
        int count=0;
        for(int i=0;i<a.size();i++)
        {
            count+=Math.abs(a.get(i));
        }
        return count;
        
    }
}