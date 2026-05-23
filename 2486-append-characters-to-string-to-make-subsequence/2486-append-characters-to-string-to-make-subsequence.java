class Solution {
    public int appendCharacters(String s, String t) {
        int ind = 0;

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            boolean found = false;

            for (int j = ind; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    ind = j + 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return t.length() - i;
            }
        }

        return 0;
    }
}