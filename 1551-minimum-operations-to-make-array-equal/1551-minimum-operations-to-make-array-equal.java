class Solution {
    public int minOperations(int n) {
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=(2*i)+1;
            sum=sum+arr[i];
        }
        int target=sum/n;
        int num=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i]-target;
            if(num<0){
                num=num*(-1);
            }
            sum1=sum1+num;
        }
        return sum1/2;
        
    }
}