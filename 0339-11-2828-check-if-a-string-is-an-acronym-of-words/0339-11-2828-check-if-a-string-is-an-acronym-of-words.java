class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (s.length() == words.size()) {
            for (int i = 0; i < words.size(); i++) {
                String ch = words.get(i);
                if (ch.charAt(0) != s.charAt(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;

    }
}