class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = word1[0];
        for (int i = 1; i < word1.length; i++) {
            str = str.concat(word1[i]);
        }
        String str1 = word2[0];
        for (int i = 1; i < word2.length; i++) {
            str1 = str1.concat(word2[i]);
        }
        return str.equals(str1);

    }
}