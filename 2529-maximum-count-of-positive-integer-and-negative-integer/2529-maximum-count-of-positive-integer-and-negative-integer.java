class Solution {
    public int maximumCount(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        
        while (s <= e) {
            int mid = s + (e - s) / 2;

         
            if (nums[mid] <= 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        
        int pos = nums.length - s;

       
        s = 0;
        e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] < 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        int neg = s;

        return Math.max(pos, neg);
    }
}
