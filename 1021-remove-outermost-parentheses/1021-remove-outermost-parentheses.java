class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                if (depth > 1) {
                    result.append(c);
                }
            } else {
                if (depth > 1) {
                    result.append(c);
                }
                depth--;
            }
        }
        return result.toString();
    }
}
