import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        // Single character is already smallest palindrome
        if (n == 1) return s;

        // Take left half
        char[] left = s.substring(0, n / 2).toCharArray();
        Arrays.sort(left);

        String leftStr = new String(left);
        String rightStr = new StringBuilder(leftStr).reverse().toString();

        // If odd length, keep middle character
        if (n % 2 == 1) {
            char middle = s.charAt(n / 2);
            return leftStr + middle + rightStr;
        }

        return leftStr + rightStr;
    }
}
