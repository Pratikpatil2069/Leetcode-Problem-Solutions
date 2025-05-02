class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
      
       int ind=0;
       for(Integer key:set){
        nums[ind++]=key;
       }
       return set.size();
        
    }
}