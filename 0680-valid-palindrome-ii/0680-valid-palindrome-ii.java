class Solution {
    public boolean validPalindrome(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int count = 0;
        int flag = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                left++;
                count++;
                if (count == 2) {
                    flag = 1;
                    break;
                }
            } else {
                left++;
                right--;
            }
        }
        if (flag == 1) {
            left = 0;
            count = 0;
            right = arr.length - 1;
            while (left < right) {
                if (arr[left] != arr[right]) {
                    right--;
                    count++;
                    if (count == 2) {
                        return false;
                    }
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}