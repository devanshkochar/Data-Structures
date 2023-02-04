class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        Map <Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int x:m.keySet()){
            if(k==0 && m.get(x)>1){
                count++;
            }
            else if(k!=0 && m.containsKey(x+k)){
                count++;
            }
            
        }
        return count;
    }
}