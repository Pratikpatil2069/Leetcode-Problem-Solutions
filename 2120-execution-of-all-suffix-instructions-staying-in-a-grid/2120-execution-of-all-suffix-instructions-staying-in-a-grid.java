class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int ans[]=new int[s.length()];
        int size=n-1;
        for(int i=0;i<s.length();i++){
            int row=startPos[0];
            int col=startPos[1];
            boolean flag=true;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='R'){
                    col++;
                }else if(ch=='L'){
                    col--;
                }else if(ch=='U'){
                    row--;
                }else{
                    row++;
                }
                if(!((row>=0 && row<=size) && (col>=0 && col<=size))){
                    ans[i]=j-i;
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans[i]=s.length()-i;
            }
        }
        return ans;
    }
}