class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (s.length() >= str.length()) {
                if (str.equals(s.substring(0, str.length()))) {
                    count++;
                }
            }
        }
        return count;
    }
}
