class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int dif=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                dif=0;
                if(s.charAt(i)==t.charAt(j)){
                    dif=i-j;
                    if(dif<0){
                        dif=dif*(-1);
                    }
                    sum=sum+dif;
                }
            }
        }
        return sum;
    }
}