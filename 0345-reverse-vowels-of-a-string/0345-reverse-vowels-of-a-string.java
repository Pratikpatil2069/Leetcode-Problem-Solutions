class Solution {
    public String reverseVowels(String s) {
        HashSet<Character>set=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char ch[]=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(!set.contains(ch[left])){
                left++;
            }else if(!set.contains(ch[right])){
                right--;
            }else{
                char c=ch[left];
                ch[left]=ch[right];
                ch[right]=c;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}