class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i=0;i<boxGrid.length;i++){
            int o=boxGrid[i].length-1;
            for(int j=boxGrid[i].length-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    o=j-1;
                }else if(boxGrid[i][j]=='#'){
                    if(boxGrid[i][o]=='.'){
                        boxGrid[i][o]=boxGrid[i][j];
                        boxGrid[i][j]='.';
                    }
                    
                    o--;
                }
            }
        }
        char ans[][]=new char[boxGrid[0].length][boxGrid.length];
        for(int i=0;i<boxGrid.length;i++){
            for(int j=0;j<boxGrid[i].length;j++){
                ans[j][ans[0].length-1-i]=boxGrid[i][j];
            }
        }
        return ans;
    }
}