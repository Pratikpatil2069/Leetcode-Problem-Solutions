class Solution {
    public int minOperations(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(nums[i])){
                return ((i+1)/3)+(((i+1)%3==0)?0:1);
            }
            set.add(nums[i]);
        }
        return 0;
    }
}