class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] v=new int[rooms.size()];
        dfs(rooms,v,0);
        for(int i=0;i<v.length;i++){
            if(v[i]==0)return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int[] v, int i){
        if(v[i]==1)return;
        v[i]=1;
        for(int x:rooms.get(i)){
            dfs(rooms,v,x);
        }
        return;
    }
}