class Solution {
    public int maxScore(String s) {
        int max=0;
        int count=0;
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                count++;
            }
        }
         int sum=count;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                sum=sum+1;
                max=Math.max(max,sum);
            }else{
                sum=sum-1;
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}