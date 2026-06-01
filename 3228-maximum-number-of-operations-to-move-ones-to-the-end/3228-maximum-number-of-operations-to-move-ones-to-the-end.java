class Solution {
    public int maxOperations(String s) {
        int count=0;
        int ones=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
                flag=true;
            }else{
                if(flag){
                    count+=ones;
                    flag=false;
                }
            }

        }
        return count;
    }
}
