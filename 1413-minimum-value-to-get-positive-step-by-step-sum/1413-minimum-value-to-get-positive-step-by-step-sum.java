class Solution {
    public int minStartValue(int[] nums) {
        int num = 1;
        int count = 0;

        do {
            int sum = num;  
            count = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i]; 
                if (sum < 1) {
                    count++;
                    break;  
                }
            }
               num++;  
           
        } while (count != 0);

        return num-1;
    }
}
