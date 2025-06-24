class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean firstBit=false;
        boolean secondBit=false;
         if((n&1)==1){
                firstBit=true;
            }else{
               firstBit= false;
            }
            n=n>>1;
        while(n>0){
             if((n&1)==1){
                secondBit=true;
            }else{
                secondBit=false;
            }
            if(firstBit==secondBit){
                return false;
            }
            firstBit=secondBit;
            n=n>>1;
        }
        return true;
    }
}