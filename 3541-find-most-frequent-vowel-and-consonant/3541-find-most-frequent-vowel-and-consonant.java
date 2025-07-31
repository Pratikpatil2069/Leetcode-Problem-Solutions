class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            }else{
                map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
            }
        }
        Set<Character>set1=map1.keySet();
         Set<Character>set2=map2.keySet();
         int max1=0;
         int max2=0;
         for(char ch:set1){
            if(map1.get(ch)>max1){
                max1=map1.get(ch);
            }
         }
         for(char ch:set2){
            if(map2.get(ch)>max2){
                max2=map2.get(ch);
            }
         }

        return max1+max2;
    }
}