class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int flag=0;
            for(int j=0;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}