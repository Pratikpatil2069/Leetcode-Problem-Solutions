class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int ind = pref.length();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (str.length() >= ind) {
                String ch = str.substring(0, ind);
                if (ch.equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}