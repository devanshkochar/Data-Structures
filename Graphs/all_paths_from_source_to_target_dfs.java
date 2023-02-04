class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List <Integer> path=new ArrayList<>();
        path.add(0);
        dfs(graph,0,path);
        
        return result;
        
        
        
    }
    public void dfs(int[][]graph,int i,List<Integer> path){
        if(i==graph.length-1){
        List<Integer> copy=new ArrayList<>();
            for(int j=0;j<path.size();j++){
                copy.add(path.get(j));
            }
            result.add(copy);
            
            return;
            
        }
        for(int x:graph[i]){
            path.add(x);
            dfs(graph,x,path);
            path.remove(path.size()-1);
            
        }
        return;
       
    }
}