class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int left=0;
            int right=s.length()-1;
            int flag=0;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    flag=1;
                    break;
                }
                left++;
                right--;
            }
            if(flag==0){
                return s;
            }
        }
        return "";
    }
}