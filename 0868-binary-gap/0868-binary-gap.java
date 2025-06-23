class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int max=0;
        int ind=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                if(ind!=-1){
                    max=Math.max(max,(i-ind));
                }
                 ind=i;
            }
        }
        return max;
    }
}