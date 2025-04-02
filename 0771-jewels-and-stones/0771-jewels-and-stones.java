class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                     map.put(jewels.charAt(i),map.getOrDefault(jewels.charAt(i),0)+1);
                }
            }
        }
        Set<Character>set=map.keySet();
        int sum=0;
        for(Character key:set){
            sum=sum+map.get(key);
        }
        return sum;
    }
}