class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int num=nums[i]-nums[j];
                if(num<0){
                    num=num*(-1);
                }
                if(num==k){
                    count++;
                }
            }
        }
        return count;
    }
}