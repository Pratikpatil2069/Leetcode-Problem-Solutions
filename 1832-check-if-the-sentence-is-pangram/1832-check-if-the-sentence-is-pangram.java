class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a';i<='z';i++){
            int flag=0;
            for(int j=0;j<sentence.length();j++){
                if(i==sentence.charAt(j)){
                    flag=1;
                }
            }
            if(flag==0){
                return false;
            }
        }
        return true;
    }
}