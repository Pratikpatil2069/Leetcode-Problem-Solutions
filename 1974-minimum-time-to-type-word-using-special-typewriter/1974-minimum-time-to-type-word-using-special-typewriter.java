class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char curr = 'a';

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            int diff = Math.abs(ch - curr);

            time += Math.min(diff, 26 - diff);

            time += 1; 

            curr = ch;
        }

        return time;
    }
}