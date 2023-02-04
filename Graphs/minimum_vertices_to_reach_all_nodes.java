class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> s= new HashSet<>();
        Set<Integer> s1= new HashSet<>();
        for(int i=0;i<edges.size();i++){
            s1.add(edges.get(i).get(1));
            s1.add(edges.get(i).get(0));
        }
        for(int i=0;i<edges.size();i++){
            s.add(edges.get(i).get(1));
        }
        List <Integer> x= new ArrayList<>();
        
        for(int c:s1){
            if(!s.contains(c)){
                x.add(c);
            }
        }
        
            
        
        return x;
        
        
    }
}