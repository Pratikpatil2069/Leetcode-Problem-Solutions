class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
             map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        int count=0;
        for(int num:map.values()){
            if(num>0){
                count+=num;
            }
        }
        return count;
    }
}