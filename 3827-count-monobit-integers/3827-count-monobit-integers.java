class Solution {
    public int countMonobit(int n) {         
        int count=0;
        for(int i=0;i<=n;i++){
           boolean flag=true;
           String str=Integer.toBinaryString(i);
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(j)!=str.charAt(j+1)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}