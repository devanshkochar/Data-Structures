class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer,String> h=new HashMap<>();
        for(int i=0;i<names.length;i++){
            h.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
    String[] r=new String[names.length];   
        for(int i=0;i<heights.length;i++){
            r[i]=h.get(heights[heights.length-1-i]);
        }
        return r;
    }
    
    
}