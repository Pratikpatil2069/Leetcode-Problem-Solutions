class Solution {
    public int candy(int[] ratings) {
        int maxCandys=0;
        int leftArr[]=new int[ratings.length];
        leftArr[0]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                leftArr[i]=leftArr[i-1]+1;
            }else{
                leftArr[i]=1;
            }
        }
        int rightArr[]=new int[ratings.length];
        rightArr[rightArr.length-1]=1;
        for(int i=rightArr.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightArr[i]=rightArr[i+1]+1;
            }else{
                rightArr[i]=1;
            }
        }
        for(int i=0;i<ratings.length;i++){
            maxCandys+=Math.max(leftArr[i],rightArr[i]);
        }
        return maxCandys;
    }
}