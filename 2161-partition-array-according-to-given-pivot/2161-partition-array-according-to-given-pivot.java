class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>list=new ArrayList<>();
        int ind=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                nums[ind++]=nums[i];
            }else if(nums[i]>pivot){
                list.add(nums[i]);
            }else{
                count++;
            }
        }
        while(count>0){
            nums[ind++]=pivot;
            count--;
        }
        for(int i=0;i<list.size();i++){
            nums[ind++]=list.get(i);
        }
        return nums;
        
    }
}