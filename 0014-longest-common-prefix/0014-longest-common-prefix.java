class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int len = 0;
        while (strs[0].length() > len) {
            char ch = strs[0].charAt(len);
            boolean flag = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= len || strs[i].charAt(len) != ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                s = s + ch;
            } else {
                break;
            }
            len++;
        }
        return s;
    }
}