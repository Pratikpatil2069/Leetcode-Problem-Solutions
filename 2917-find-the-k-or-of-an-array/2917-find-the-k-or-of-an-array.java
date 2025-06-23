class Solution {
    public int findKOr(int[] nums, int k) {
        String arr[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.toBinaryString(nums[i]);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
            }
        }

        String res = "";
        int count = 0;

        for (int i = 0; i < max; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                int bitIndexFromRight = arr[j].length() - 1 - i;
                if (bitIndexFromRight >= 0 && arr[j].charAt(bitIndexFromRight) == '1') {
                    count++;
                }
            }

            if (count >= k) {
                res = res + "1";
            } else {
                res = res + "0";
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(res);
        sb.reverse(); 
        String s = sb.toString();

        return Integer.parseInt(s, 2);
    }
}
