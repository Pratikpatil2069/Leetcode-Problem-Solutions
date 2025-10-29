class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j;k<arr.length;k++){
                    if(isTriplets(arr,i,j,k)){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
    private boolean isTriplets(int []arr,int i,int j,int k){
        int xor1=0;
        int xor2=0;
        for(int start=i;start<j;start++){
            xor1^=arr[start];
        }
        for(int mid=j;mid<=k;mid++){
            xor2^=arr[mid];
        }
        return xor1==xor2;
    }
}