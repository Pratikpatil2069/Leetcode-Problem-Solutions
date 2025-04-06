class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int ind=0;
        if(n%2==1){
            for(int i=-(n/2);i<=n/2;i++){
                arr[ind]=i;
                ind++;
            }
        }else{
             for(int i=-n/2;i<=n/2;i++){
                if(i==0){
                    continue;
                }
                arr[ind]=i;
                ind++;
             }
        }
        return arr;
    }
}