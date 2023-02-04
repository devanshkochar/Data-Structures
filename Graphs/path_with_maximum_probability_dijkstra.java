class Node{
    int data;
    double p;
    Node(int data,double p){
        this.data=data;
        this.p=p;
    }
    
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map <Integer,List<Node>> h=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            if(h.containsKey(edges[i][0])){
                h.get(edges[i][0]).add(new Node(edges[i][1],succProb[i]));
            }else{
                List<Node>l1=new ArrayList<>();
                l1.add(new Node(edges[i][1],succProb[i]));
                h.put(edges[i][0],l1);
            }
        
        }for(int i=0;i<edges.length;i++){
            if(h.containsKey(edges[i][1])){
                h.get(edges[i][1]).add(new Node(edges[i][0],succProb[i]));
            }else{
                List<Node>l1=new ArrayList<>();
                l1.add(new Node(edges[i][0],succProb[i]));
                h.put(edges[i][1],l1);
            }
        
        }
        //System.out.println(h.get(1).get(0).p);
        double [] max_prob=new double[n];
        Arrays.fill(max_prob,-1);
        max_prob[start]=1;
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{return Double.compare(b.p, a.p);});
        
        pq.add(new Node(start,1.0));
        while(!pq.isEmpty()){
            Node a= pq.poll();
            if(h.containsKey(a.data)){
                System.out.println("Yayy");
                for(Node x:h.get(a.data)){
                    System.out.println("x : " + x.data + "\t" + "a : " + a.data);
                    if(x.p*a.p>max_prob[x.data]){
                        max_prob[x.data]=x.p*a.p; 
                        pq.add(new Node(x.data,max_prob[x.data]));
                    }
                    
                }
            
            }
        }
        if(max_prob[end]==-1)return 0;
        return max_prob[end];
        
        
    }
}