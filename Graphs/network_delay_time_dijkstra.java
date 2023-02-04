class Node{
    int data;
    int time;
    Node(int data,int time){
        this.data=data;
        this.time=time;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<Node>> h=new HashMap<>();
        for(int i=0;i<times.length;i++){
            if(h.containsKey(times[i][0])){
                h.get(times[i][0]).add(new Node(times[i][1],times[i][2]));
            }else{
                List<Node> l=new ArrayList<>();
                l.add(new Node(times[i][1],times[i][2]));
                h.put(times[i][0],l);
            }
        }
        int [] a=new int[n+1];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[k]=0;
        a[0]=0;
        PriorityQueue<Node> pq=new PriorityQueue<>((x,y)->x.time-y.time);
        pq.add(new Node(k,0));
        while(pq.size()!=0){
            Node x=pq.poll();
            if(h.containsKey(x.data)){
                for(Node b:h.get(x.data)){
                    if(a[b.data]>b.time+x.time){
                        a[b.data]=b.time+x.time;
                        pq.add(new Node(b.data,a[b.data]));
                    }
                }
            }
        }
        Arrays.sort(a);
        if(a[a.length-1]==Integer.MAX_VALUE)return -1;
        return a[a.length-1];
    }
}