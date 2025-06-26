class Solution {
    public char findTheDifference(String s, String t) {
        char xor=0;
        
        for(Character c:s.toCharArray()){
            xor^=c;
        }
         for(Character c:t.toCharArray()){
            xor^=c;
        }
        return xor;
    }
}