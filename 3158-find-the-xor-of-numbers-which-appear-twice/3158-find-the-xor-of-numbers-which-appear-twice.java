class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        int xor=0;
        for(Integer key:set){
            if(map.get(key)==2){
                xor=key^xor;
            }
        }
        return xor;
    }
}