class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        List<Integer>list=new ArrayList<>();
         if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        if(nums.length==2){
            list.add(nums[0]);
            if(!list.contains(nums[1])){
                list.add(nums[1]);
            }
            return list;
        }
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>nums.length/3){
                    list.add(nums[i]);
                    break;
                }
            }else{
                count=1;
            }
        }
        count=1;
         for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>nums.length/3){
                    list.add(nums[i]);
                    break;
                }
            }else{
                count=1;
            }
        }
        if( list.size()==2&&(int)list.get(0)==(int)list.get(1)){
            list.remove(0);
        }
        return list;
    }
}