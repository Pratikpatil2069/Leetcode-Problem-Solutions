class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i),0)+1);
        }
         for(int i=0;i<word2.length();i++){
            map.put(word2.charAt(i),map.getOrDefault(word2.charAt(i),0)-1);
         }
        Set<Character>set=map.keySet();
        for(Character key:set){
            if(map.get(key)>3 || map.get(key)<-3){
                return false;
            }
        }
        return true;
    }
}