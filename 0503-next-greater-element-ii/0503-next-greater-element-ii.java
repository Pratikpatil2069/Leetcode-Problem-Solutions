class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ind=(i+1)%nums.length;
            boolean flag=true;
            while(ind!=i){
                if(num<nums[ind]){
                    ans[i]=nums[ind];
                    flag=false;
                    break;
                }
                ind=(ind+1)%nums.length;
            }
            if(flag){
                ans[i]=-1;
            }
        }
        return ans;
    }
}