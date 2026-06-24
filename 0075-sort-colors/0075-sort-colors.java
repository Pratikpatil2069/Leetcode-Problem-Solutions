class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length-1;i++){
        //     int num=nums[i];
        //     int ind=i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(num>nums[j]){
        //            num=nums[j];
        //            ind=j;
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=num;
        //     nums[ind]=temp;
        // }
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }
            if(nums[i]==2){
                two++;
            }
        }
        int ind=0;
        for(int i=0;i<zero;i++){
            nums[ind++]=0;
        }
        for(int i=0;i<one;i++){
            nums[ind++]=1;
        }
        for(int i=0;i<two;i++){
            nums[ind++]=2;
        }
       
    }
}