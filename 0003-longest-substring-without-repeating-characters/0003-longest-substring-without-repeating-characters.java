class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int lastInd = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && map.get(ch) >= lastInd){
                max = Math.max(max, i - lastInd);
                lastInd = map.get(ch) + 1;   // corrected
            }

            map.put(ch, i);
        }

        max = Math.max(max, s.length() - lastInd);
        return max;
    }
}