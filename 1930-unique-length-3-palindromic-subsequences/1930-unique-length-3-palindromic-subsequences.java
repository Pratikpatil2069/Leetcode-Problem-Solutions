class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        for(char ch='a';ch<='z';ch++){
            int left=s.indexOf(ch);
            int right=s.lastIndexOf(ch);
            HashSet<Character>set= new HashSet<>();
            if(left!=-1 && right!=-1 && left<right){
                for(int i=left+1;i<right;i++){
                    set.add(s.charAt(i));
                }
                count+=set.size();
            }
        }

        return count;
    }
}