class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int num1=0;
        for(int i=0;i<gain.length;i++){
            int num2=gain[i]+num1;
            max=Math.max(max,num2);
            num1=num2;
        }
        return max;
    }
}