class Solution {
    public int maximumDetonation(int[][] bombs) {
        
        Map<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<bombs.length;i++){
            List<Integer> l=new ArrayList<>();
            h.put(i,l);
            for(int j=0;j<bombs.length;j++){
                if(i==j)continue;
                else{
                    double dist=Math.sqrt(Math.pow((bombs[i][0]-bombs[j][0]),2)+Math.pow((bombs[i][1]-bombs[j][1]),2));
                    if((double)bombs[i][2]>=dist){
                        h.get(i).add(j);
                        
                    }
                }
            }}
            int m=0;
            for(int i=0;i<bombs.length;i++){
               int[] v=new int[bombs.length];
                dfs(h,v,i);
                int count=0;
                for(int t:v){
                    if(t==1){
                        count++;
                    }
                }
                m=Math.max(m,count);
            }
            
        
        return m;
        
    }
    
    public void dfs(Map<Integer,List<Integer>> h,int[] v,int i){
        if(v[i]==1)return;
        v[i]=1;
        for(int z:h.get(i)){
            dfs(h,v,z);
        }
        
    }
}