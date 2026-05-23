class Solution {
    public int appendCharacters(String s, String t) {
        int ind = 0;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            for (int j = ind; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    ind = j + 1;
                    break;
                }
                if(j==s.length()-1){
                    return t.length()-i;
                }
            }
            if(ind==s.length()){
                 return t.length()-i-1;
            }
           
            

        }
        return 0;
    }
}