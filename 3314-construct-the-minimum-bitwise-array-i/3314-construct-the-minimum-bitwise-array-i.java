class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            boolean flag=false;
            int target=0;
            while(nums.get(i)>target){
                if((target | (target+1))==nums.get(i)){
                    ans[i]=target;
                    flag=true;
                    break;
                }
                target++;
            }
            if(!flag){
                ans[i]=-1;
            }
        }
        return ans;
    }
}