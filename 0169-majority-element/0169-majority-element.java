class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> set=map.keySet();
        for(Integer key:set){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}