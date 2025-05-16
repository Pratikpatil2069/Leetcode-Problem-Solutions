class Solution {
    public int countPartitions(int[] nums) {
        int  count=0;
        
        for(int j=0;j<nums.length-1;j++){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(i<=j){
            sum1=sum1+nums[i];
            }else{
                sum2=sum2+nums[i];
            }
            
        }
        if((sum1-sum2)%2==0){
            count++;
        }
        
        }
        return count;
    }
}