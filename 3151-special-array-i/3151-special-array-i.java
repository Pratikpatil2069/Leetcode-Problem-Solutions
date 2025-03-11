class Solution {
    public boolean isArraySpecial(int[] nums) {
        int flag=0;
       for(int i=0;i<nums.length-1;i++){
         flag=0;
        if(nums[i]%2==0){
            if(nums[i+1]%2==1){
                flag=1;
            }else{
                return false;
            }
        }else if(nums[i+1]%2==0){
            flag=1;
        }else{
            return false;
        }
       }
       if(nums.length==1){
        flag=1;
       }
       if(flag==0){
        return false;
       }else{
        return true;
       }
        
    }
}