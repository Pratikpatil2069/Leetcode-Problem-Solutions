class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        HashSet<Float>set=new HashSet<>();
        while(left<right){
            float num=(float)(nums[left]+nums[right])/2;
            set.add(num);
            left++;
            right--;
        }
     return set.size();   
    }
}