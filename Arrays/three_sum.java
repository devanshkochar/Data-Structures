class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        int j=1;
        int k=nums.length-1;
        for(int i=0;i<nums.length-2;){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
            
               if(nums[i]+nums[j]+nums[k]==0){
                   List<Integer> x=new ArrayList<>();
                   x.add(nums[i]);
                   x.add(nums[j]);
                   x.add(nums[k]);
                   l.add(x);
                   while(j<k && nums[j]==nums[j+1]){j++;} 
                   j++;
                   while(k>j && nums[k]==nums[k-1]){k--;}
                   k--;
               }
                else if(nums[i]+nums[j]+nums[k]>0)
                   {
                       k--;
                   }
                else{
                       j++;
                   }
                if(j>=k){
                    i++;
                    j=i+1;
                    k=nums.length-1;
                }

            }
            else{
                i++;
                j=i+1;
                k=nums.length-1;
            }
        }
               return l;
        
    }
}