class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int [] a= new int[numCourses];
        Map<Integer,List<Integer>> h =new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<prerequisites.length;i++){
            a[prerequisites[i][0]]++;
        }
        for(int i=0;i<prerequisites.length;i++){
            if(h.containsKey(prerequisites[i][1])){
                h.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }else{
                List<Integer> l=new ArrayList<>();
                l.add(prerequisites[i][0]);
                h.put(prerequisites[i][1],l);
            }
        }
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                q.add(i);
            }
        }
        while(q.size()!=0){
            int x=q.poll();
            l1.add(x);
            if(h.containsKey(x)){
                for(int i=0;i<h.get(x).size();i++){
                    a[h.get(x).get(i)]--;
                    if(a[h.get(x).get(i)]==0){
                        q.add(h.get(x).get(i));
                    }
                }
                
            }
        
        }
          for(int i=0;i<a.length;i++){
              if(a[i]!=0){
                  return new int[0];
              }
          } 
        int[] z=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            z[i]=l1.get(i);
        }
        
        
        return z;
        
        
    }
}