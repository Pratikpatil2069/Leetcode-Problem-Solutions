class Solution {
    public int maximumGroups(int[] grades) {
        // int count=0;
        // Arrays.sort(grades);
        // int left=0;
        // int right=grades.length-1;
        // int sum=0;
        // int preSum=0;
        // int count1=0;
        // boolean flag=true;
        // int preCount=0;
        // while(left<=right){
        //     if(flag){
        //         sum+=grades[right--];
        //         flag=false;
        //     }else{
        //         sum+=grades[left++];
        //         flag=true;
        //     }
        //     count1++;
        //     if(sum>preSum && count1>preCount){
        //         preCount=count1;
        //         count1=0;
        //         preSum=sum;
        //         sum=0;
        //         count++;
        //         flag=true;
        //     }

        // }
        // return count;
        int count=0;
        int c=0;
        int prevC=0;
        for(int i=0;i<grades.length;i++){
            c++;
            if(c>prevC){
                count++;
                prevC=c;
                c=0;
            }

        }
        return count;
    }
}