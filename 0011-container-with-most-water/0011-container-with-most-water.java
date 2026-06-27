class Solution {
    public int maxArea(int[] height) {
        // int max=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=height.length-1;j>i;j--){
        //         int high=Math.min(height[i],height[j]);
        //         int wid=j-i;
        //         max=Math.max(max,wid*high);
        //     }
        // }
        //  return max;
        
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int high=Math.min(height[left],height[right]);
            int wid=right-left;
            max=Math.max(max,high*wid);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}