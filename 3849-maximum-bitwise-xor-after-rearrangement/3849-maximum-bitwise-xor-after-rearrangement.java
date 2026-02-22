class Solution {
    public String maximumXor(String s, String t) {
        int countOfOnes=0;
         for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '1') {
                countOfOnes++;
            }
        }
        int countOfZeros=s.length()-countOfOnes;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(countOfZeros>0){
                    sb.append('1');
                    countOfZeros--;
                }else{
                    sb.append('0');
                    countOfOnes--;
                }
            }else{
                 if(countOfOnes>0){
                    sb.append('1');
                    countOfOnes--;
                }else{
                    sb.append('0');
                    countOfZeros--;
                }
            }
        }
        return sb.toString();
    }
}