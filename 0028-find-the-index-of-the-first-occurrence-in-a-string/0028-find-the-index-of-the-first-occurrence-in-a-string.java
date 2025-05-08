class Solution {
    public int strStr(String haystack, String needle) {
        int size=needle.length();
        for(int i=0;i<haystack.length();i++){
            int sub=Math.min(i+size,haystack.length());
            if(needle.equals(haystack.substring(i,sub))){
                return i;
            }
        }
        return -1;
    }
}