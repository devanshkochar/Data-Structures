import java.text.*;
class Solution {
    
    public List<Double> averageOfLevels(TreeNode root) {
        Queue q = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Long>>  result = new ArrayList<ArrayList<Long>>();
        q.add(root);
        while(true)
        {
            int nodeCount = q.size();
            if(nodeCount==0)
            {
                break;
            }
            ArrayList<Long> l = new ArrayList<Long>();
            while(nodeCount>0)
            {
                TreeNode temp=(TreeNode)q.peek();
                l.add((long)temp.val);
                q.remove();
                
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                nodeCount--;
            }
            result.add(l);
        }
        ArrayList<Double> ret = new ArrayList<Double>();
        for(int i=0;i<result.size();i++)
        {
            ArrayList l = result.get(i);
            long sum=0;
            double avg=0.0;
            for(int j=0;j<l.size();j++)   
            {
                sum+=(long)l.get(j);
            }
            avg = (double)sum/l.size();
            //System.out.println(l.size());
            if(i==1)
            {
                System.out.println(sum);
                System.out.println(avg);    
            }
            DecimalFormat df = new DecimalFormat("0.#########");
            String average = df.format(avg);
            avg = Double.parseDouble(average);
            ret.add(avg);
            //System.out.println(average);
        }
        return ret;
    }
}