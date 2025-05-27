class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Character>set=map.keySet();
        HashSet<Character>set1=new HashSet<>();
        for(Character key:set){
            if(map.get(key)==1){
                set1.add(key);
            }
        }
        for(int i=0;i<s.length();i++){
            if(set1.contains(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}