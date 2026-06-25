class Solution {
    public int majorityElement(int[] nums) {
       int count=0;
       int num=0;
       for(int val:nums){
        if(count==0){
            num=val;
            count++;
        }else
        if(val==num){
            count++;
        }else{
            count--;
        }
       }
       return num;
    }
}