class Solution {
    public int[] productExceptSelf(int[] nums) {
       int pro=1;
       int count=0;
       int ind=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            pro*=nums[i];
        }else{
            count++;
            ind=i;
        }
        
       }
       int ans[]=new int[nums.length];
       if(count>=2){
        return ans;
       }
       if(count==1){
        ans[ind]=pro;
        return ans;
       }
       for(int i=0;i<nums.length;i++){
         ans[i]=pro/nums[i];
            
       }
        return ans;
        
    }
}