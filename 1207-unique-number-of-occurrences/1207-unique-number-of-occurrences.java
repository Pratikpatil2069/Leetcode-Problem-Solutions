class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        for(Integer key:set){
            int num=map.get(key);
            for(Integer key1:set){
                if(map.get(key1)==num && key!=key1){
                    return false;
                }
            }
        }
        return true;
    }
}