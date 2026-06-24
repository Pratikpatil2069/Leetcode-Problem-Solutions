class Solution {
    public void sortColors(int[] nums) {
        //Dutch National flag Algorithm.
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            
            if(nums[mid]==0){
                int num=nums[low];
                nums[low++]=0;
                nums[mid++]=num;
                
            }else
            if(nums[mid]==1){
                mid++;
            }else
            {
               int num1=nums[high];
                nums[high--]=2;
                nums[mid]=num1;
            }
        }
        // int zero=0;
        // int one=0;
        // int two=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         zero++;
        //     }
        //     if(nums[i]==1){
        //         one++;
        //     }
        //     if(nums[i]==2){
        //         two++;
        //     }
        // }
        // int ind=0;
        // for(int i=0;i<zero;i++){
        //     nums[ind++]=0;
        // }
        // for(int i=0;i<one;i++){
        //     nums[ind++]=1;
        // }
        // for(int i=0;i<two;i++){
        //     nums[ind++]=2;
        // }

        
    }
}