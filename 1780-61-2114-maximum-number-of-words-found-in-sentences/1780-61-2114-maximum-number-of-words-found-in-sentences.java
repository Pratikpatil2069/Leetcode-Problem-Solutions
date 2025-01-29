class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String ch = sentences[i];
            int count = 1;
            for (int j = 0; j < ch.length(); j++) {
                if (ch.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}