class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            boolean flag=false;
            int num=Integer.bitCount(i);
            if(num<2){
                flag=true;
            }else{
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    flag=true;
                    break;
                }
            }
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }
}