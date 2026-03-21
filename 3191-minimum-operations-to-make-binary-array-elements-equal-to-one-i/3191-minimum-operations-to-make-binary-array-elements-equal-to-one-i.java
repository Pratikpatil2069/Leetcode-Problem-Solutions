class Solution {
    public int minOperations(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count++;
            nums[i]=1;
            if(i+2<nums.length){
                if(nums[i+1]==0){
                    nums[i+1]=1;
                }else{
                    nums[i+1]=0;
                }
                if(nums[i+2]==0){
                    nums[i+2]=1;
                }else{
                    nums[i+2]=0;
                }
            }else{
                return -1;
            }
        }

    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            return -1;
        }
    }
        return count;
    }
}