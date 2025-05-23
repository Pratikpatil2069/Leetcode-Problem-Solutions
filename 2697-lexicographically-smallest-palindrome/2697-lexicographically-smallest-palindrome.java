class Solution {
    public String makeSmallestPalindrome(String s) {
        char ch[]=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(ch[left]!=ch[right]){
                if(ch[left]<ch[right]){
                ch[right]=ch[left];
                }else{
                    ch[left]=ch[right];
                }
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}