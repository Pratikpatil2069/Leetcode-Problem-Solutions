class Solution {
    public char findTheDifference(String s, String t) {
        char xor = t.charAt(t.length() - 1);  
        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i) ^ t.charAt(i);
        }
        return  xor;
    }
}
