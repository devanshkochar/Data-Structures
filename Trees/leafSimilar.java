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
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    public void getleaf(TreeNode r)
    {
        if(r==null)
        {
            return;
        }
        if(r.left==null && r.right==null)
        {
            a1.add(r.val);
        }
        else
        {
            getleaf(r.left);
            getleaf(r.right);
        }
    }
    public void getleaf2(TreeNode r)
    {
        if(r==null)
        {
            return;
        }
        if(r.left==null && r.right==null)
        {
            a2.add(r.val);
        }
        else
        {
            getleaf2(r.left);
            getleaf2(r.right);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getleaf(root1);
        getleaf2(root2);
        
        int l=0;
        if(a1.size()>a2.size())
        {
            l=a2.size();
        }
        else
        {
            l=a1.size();
        }
        /*for(int i=0;i<a1.size();i++)
        {
            System.out.print(a1.get(i));
        }
        //System.out.println(a2.size());
        for(int i=0;i<a2.size();i++)
        {
            System.out.print(a2.get(i));
        }*/
        if(a1.size()!=a2.size())
        {
            return false;
        }
        for(int i=0;i<l;i++)
        {
            if(a1.get(i)!=a2.get(i))
            {
                return false;
            }
        }
        return true;
    }
}