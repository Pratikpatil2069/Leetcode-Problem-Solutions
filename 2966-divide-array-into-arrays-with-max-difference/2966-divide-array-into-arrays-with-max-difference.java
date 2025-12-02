class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length/3;
        int result[][]=new int [n][3];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
        }
        int ind=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                result[i][j]=nums[ind++];
            }
        }
        return result;
    }
}