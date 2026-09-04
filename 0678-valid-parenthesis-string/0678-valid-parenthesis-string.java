class Solution {
    Boolean[][] dp;

    public boolean checkValidString(String s) {
        dp = new Boolean[s.length()][s.length() + 1];
        return generateParanthesis(s, 0, 0);
    }

    public boolean generateParanthesis(String s, int ind, int count) {

        if (count < 0) {
            return false;
        }

        if (ind == s.length()) {
            return count == 0;
        }

        if (dp[ind][count] != null) {
            return dp[ind][count];
        }

        if (s.charAt(ind) == '(') {
            return dp[ind][count] =
                generateParanthesis(s, ind + 1, count + 1);
        }

        if (s.charAt(ind) == ')') {
            return dp[ind][count] =
                generateParanthesis(s, ind + 1, count - 1);
        }

      
        return dp[ind][count] =
            generateParanthesis(s, ind + 1, count + 1) ||
            generateParanthesis(s, ind + 1, count - 1) ||
            generateParanthesis(s, ind + 1, count);
    }
}