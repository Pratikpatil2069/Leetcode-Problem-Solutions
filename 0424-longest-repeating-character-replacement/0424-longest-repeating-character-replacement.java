class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFre = 0;
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            maxFre = Math.max(maxFre, map.get(s.charAt(i)));
            while ((i - left + 1) - maxFre > k) {
                int fre = map.get(s.charAt(left));
                fre--;
                map.put(s.charAt(left), fre);
                maxFre = 0;

                for (char j = 'A'; j <= 'Z'; j++) {
                    if (map.containsKey(j)) {
                        maxFre = Math.max(maxFre, map.get(j));
                    }

                }
                left++;
            }

            maxLen = Math.max(maxLen, i - left + 1);

        }
        return maxLen;
    }
}