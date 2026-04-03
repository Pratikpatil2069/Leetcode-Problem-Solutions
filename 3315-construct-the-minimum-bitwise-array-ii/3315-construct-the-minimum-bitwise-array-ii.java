class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)%2==0){
                ans[i]=-1;
            }else{
                int count=0;
                for(int j=0;j<32;j++){
                    if(((1<<j)&nums.get(i))!=0){
                        count++;
                    }else{
                        break;
                    }
                }
                ans[i]=nums.get(i)-(int)Math.pow(2,count-1);

            }
        }
        return ans;
    }
}