class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = s.length();
        int num = 2;
        while (num <= s.length()) {
            for (int i = 0; i < s.length(); i++) {
                int left = i;
                int right = i + num - 1;
                if (right > s.length() - 1) {
                    break;
                }
                String str = s.substring(left, right + 1);
                int count0 = 0;
                int count1 = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '0') {
                        count0++;
                    } else {
                        count1++;
                    }
                }
                if (count0 <= k || count1 <= k) {
                    count++;
                }
            }
            num++;
        }
        return count;
    }
}