class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String s1=sb.toString();
        int left=0;
        int right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}