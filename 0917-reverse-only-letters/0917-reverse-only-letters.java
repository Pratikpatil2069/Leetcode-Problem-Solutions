class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            }else if (!Character.isLetter(arr[right])) {
                right--;
            }else{
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;
            left++;
            right--;
            }
        }
        return new String(arr);
    }
}