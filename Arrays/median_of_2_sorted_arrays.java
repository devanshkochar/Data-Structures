class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums3= new int[nums1.length+ nums2.length];
        for (int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for (int i=0;i<nums2.length;i++){
            nums3[nums1.length+i]=nums2[i];
        }
        Arrays.sort(nums3);
        
        int x=nums3.length;
        float ans=0;
        if(x%2==0){
            ans=nums3[x/2]+nums3[x/2-1];
        ans=ans/2;   
        }
        if(x%2==1){
        ans=nums3[x/2];
            
        }
        return ans;
        
    }
}