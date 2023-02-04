class Solution {
    long factorial(long r)
    {
        long res=1;
        if(r==0)
        {
            return 1;
        }
        for(long i=r;i>=1;i--)
        {
            res=res*i;
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList row = new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++)
            {
                long res = factorial((long)i)/(factorial((long)j)*factorial((long)i-(long)j));
                row.add(j,(int)res);
            }
            result.add(row);
        
        }
        return result;
    }
}