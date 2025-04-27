class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            String s1 = nums[left] + "";
            String s2 = nums[right] + "";
            String s3 = s1 + s2;
            long num = Integer.parseInt(s3);
            sum += num;
            left++;
            right--;
        }
        if(nums.length%2==1){
            sum=sum+nums[nums.length/2];
        }
        return sum;
    }
}