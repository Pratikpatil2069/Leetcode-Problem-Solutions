class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int dup=0;
            while(num>0){
                dup=dup+num%10;
                num=num/10;
            }
            if(dup==i){
                return i;
            }
        }
        return -1;
    }
}