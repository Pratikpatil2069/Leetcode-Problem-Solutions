class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int arr[]=new int [nums.length];
        for(int i=0;i<arr.length;i++){
            int num=0;
            for(int j=0;j<=i;j++){
                if(nums[j]==0){
                    num<<=1;
                }else{
                    num<<=1;
                    num=num|1;
                }
            }
           arr[i]=num;
        }
        List<Boolean>list=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(arr[i]%5==0){
           list.add(true);
        }else{
            list.add(false);
        }
       }  
       return list;
    }
}