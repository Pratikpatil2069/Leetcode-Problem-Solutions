class Solution {
    public int maximumScore(int a, int b, int c) {
        int arr[]={a,b,c};
        Arrays.sort(arr);
        int num1=arr[0];
        int num2=arr[1];
        int num3=arr[2];
        int diff=num3-num2;
        int count=0;
        if(diff<num1){
            count+=diff;
            num1-=diff;
            num3-=diff;
        }else{
            count+=num1;
            num1=0;
            num3-=num1;
        }
        if(num1==0){
            count+=Math.min(num2,num3);
        }else{
            count+=num1;
            int sum=(num2+num3)-num1;
            count+=sum/2;
        }
        return count;
        
    }
}