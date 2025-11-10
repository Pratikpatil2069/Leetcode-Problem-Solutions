class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            int size=1;
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if( map.containsKey(target) && map.get(target)>size/2){
                    count++;
                }
                size++;
            }
        }
        return count;
        
    }
}