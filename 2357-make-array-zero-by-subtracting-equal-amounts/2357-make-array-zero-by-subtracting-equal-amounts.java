class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int operation = 0;

        while (true) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    pq.add(nums[i]);
                }
            }
            if (pq.isEmpty()) {
                break;
            }

            int num = pq.peek();
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != 0) {
                    nums[j] = nums[j] - num;
                }
            }
            pq.clear();
            operation++;
        }
        return operation;
    }
}