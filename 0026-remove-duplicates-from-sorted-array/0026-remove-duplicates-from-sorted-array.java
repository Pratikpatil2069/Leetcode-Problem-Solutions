class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        
            list.add(nums[nums.length-1]);
        
        int i=0;
        for(Integer e:list){
            nums[i++]=e;
        }
        return list.size();
        
    }
}