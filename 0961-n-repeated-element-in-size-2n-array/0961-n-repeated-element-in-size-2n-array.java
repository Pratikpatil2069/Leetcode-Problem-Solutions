class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        for(Integer key:set){
            if(map.get(key)!=1){
                return key;
            }
        }
        return -1;
    }
}