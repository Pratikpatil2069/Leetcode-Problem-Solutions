class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int last=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                flag=true;
                continue;
            }else{
                
                if(flag){
                    int n=i-last;
                    count+=(long)n*(n+1)/2;
                    flag=false;
                }
                last=i+1;
                
                
            }
        }
        if(flag){
             int n1=nums.length-last;
            count+=(long)n1*(n1+1)/2;
        }
       
        return count;
    }
}