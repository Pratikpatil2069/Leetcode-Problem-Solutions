class Solution {
    public boolean canSortArray(int[] nums) {
        ArrayList<int[]>list=new ArrayList<>();
        int left=0;
        for(int i=0;i<nums.length-1;i++){
            if(Integer.bitCount(nums[i])!=Integer.bitCount(nums[i+1])){
                list.add(new int[]{left,i});
                left=i+1;
            }
        }
        list.add(new int[]{left,nums.length-1});
            int arr[]=list.get(0);
            int max=0;
            for(int j=arr[0];j<=arr[1];j++){
                max=Math.max(max,nums[j]);
            }
        for(int i=1;i<list.size();i++){
            int arr1[]=list.get(i);
            int min=Integer.MAX_VALUE;
            int max1=0;
            for(int j=arr1[0];j<=arr1[1];j++){
                max1=Math.max(max1,nums[j]);
                min=Math.min(min,nums[j]);
            }
            if(max>min){
                return false;
            }
            max=max1;
        }
        return true;
    }
}