class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] v=new int[isConnected.length];
        int c=0;
        for(int i=0;i<isConnected.length;i++){
            if(v[i]==0){
                dfs(v,isConnected,i);
                c++;
            }
        
        
        }
        return c;
        
    }public void dfs(int []v,int [][] isConnected, int i){
        if(v[i]==0){
            v[i]=1;
            for(int x=0;x<isConnected[0].length;x++){
                if(isConnected[i][x]==1 && i!=x){
                    dfs(v,isConnected,x);
                }
            }
            
        
        }
        return;
    }
}