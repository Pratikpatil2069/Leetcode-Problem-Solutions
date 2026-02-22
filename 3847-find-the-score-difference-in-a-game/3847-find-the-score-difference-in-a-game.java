class Solution {
    public int scoreDifference(int[] nums) {
        int totalPointsA=0;
        int totalPointsB=0;
        boolean active=true;
        for(int i=0;i<nums.length;i++){
            if((i+1)%6==0){
                if(active){
                    active=false;
                }else{
                    active=true;
                }
            }
            if(active){
                if(nums[i]%2==0){
                totalPointsA+=nums[i];
            }else{
                totalPointsB+=nums[i];
                active=false;
            }
            }else{
                 if(nums[i]%2==0){
                totalPointsB+=nums[i];
            }else{
                totalPointsA+=nums[i];
                active=true;
            }

            }

        }
        return totalPointsA-totalPointsB;
    }
}