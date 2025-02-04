class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int re=0;
            while(num!=0){
                num=num/10;
                re++;
            }
            if(re%2==0){
                count++;
            }
        }
       return count; 
    }
}