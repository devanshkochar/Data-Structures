class Node{
    int data;
    int distance;
    Node(int data,int distance){
    this.data=data;
    this.distance=distance;
        }
}
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer,List<Node>> h=new HashMap<>();
        for(int i=0;i<edges.length;i++){
        if(!h.containsKey(edges[i][0])){
            Node a=new Node(edges[i][1],edges[i][2]);
            List<Node> l=new ArrayList<>();
            l.add(a);
            h.put(edges[i][0],l);
        }
        else{
            h.get(edges[i][0]).add(new Node(edges[i][1],edges[i][2]));
        }}
        for(int i=0;i<edges.length;i++){
        if(!h.containsKey(edges[i][1])){
            Node a=new Node(edges[i][0],edges[i][2]);
            List<Node> l=new ArrayList<>();
            l.add(a);
            h.put(edges[i][1],l);
        }
        else{
            h.get(edges[i][1]).add(new Node(edges[i][0],edges[i][2]));
        }}
        
        
        int ans=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            int temp =helper(h,i,distanceThreshold,n);
            if(ans>=temp){
                ans=temp;
                index=i;
            }
        }
        return index;
        
        
        
    }
    public int helper(Map<Integer,List<Node>> h,int k,int distanceThreshold,int n){
        
        PriorityQueue <Node> pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        int[] min=new int[n];
        Arrays.fill(min,Integer.MAX_VALUE);
        min[k]=0;
        pq.add(new Node(k,0));
        
        while (!pq.isEmpty()){
            Node x=pq.poll();
            if(h.containsKey(x.data)){
            for(Node a:h.get(x.data)){
                if(a.distance+x.distance<min[a.data]){
                    min[a.data]=a.distance+x.distance;
                    pq.add(new Node(a.data,min[a.data]));
                }
            }
        }
        
    }
        int count=0;
        for(int i=0;i<min.length;i++){
            if(min[i]<=distanceThreshold && i!=k){
                count++;
            }
        }
        return count;
    }
        
}