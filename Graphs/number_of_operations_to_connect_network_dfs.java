class Solution {
    int count=0;
    public int makeConnected(int n, int[][] connections) {
        if (connections.length<n-1)return -1;
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<connections.length;i++){
            if(m.containsKey(connections[i][0])){
                m.get(connections[i][0]).add(connections[i][1]);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(connections[i][1]);
                m.put(connections[i][0],l);
            }
        }
           for(int i=0;i<connections.length;i++){
            if(m.containsKey(connections[i][1])){
                m.get(connections[i][1]).add(connections[i][0]);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(connections[i][0]);
                m.put(connections[i][1],l);
            }
           }
        boolean[]v=new boolean[n];
        for(int i=0;i<v.length;i++){
            if(v[i]==false){
                dfs(v,m,i);
                count++;
            }
        }
        
        return count-1;
        
        
    }
    public void dfs(boolean[]v,Map<Integer,List<Integer>>m,int i){
        if(v[i])return;
        else{
            v[i]=true;
            if(m.containsKey(i) && m.get(i).size()>0){
               for(int x:m.get(i)){
                dfs(v,m,x);
               }
            }
        }
    }
}