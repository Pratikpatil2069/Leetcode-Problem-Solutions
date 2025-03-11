class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list =new ArrayList<>();
       
        for(int i=0;i<nums.length;i=i+2){
            int num=nums[i];
            for(int j=num;j>0;j--){
                list.add(nums[i+1]);
            }
        }
         int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}