class Solution {
    public int maxDigitRange(int[] nums) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int low=10;
            int high=0;
            while(num>0){
                int re=num%10;
                low=Math.min(low,re);
                high=Math.max(high,re);
                num/=10;
            }
            if((high-low)>max){
                sum=nums[i];
                max=high-low;
            }else if((high-low)==max){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}