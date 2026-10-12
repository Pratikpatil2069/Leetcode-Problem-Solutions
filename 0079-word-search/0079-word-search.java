class Solution {
    public boolean exist(char[][] board, String word) {
        boolean flag=false;
        for(int i=0;i<board.length;i++){
            String arr[]=new String[2];
            arr[0]=word;
            arr[1]="";
            int vist[][]=new int[board.length][board[0].length];
            for(int j=0;j<board[i].length;j++){
                search(board , word, "",0,i,j,arr,vist);
                if(arr[0].equals(arr[1])){
                    flag=true;
                    break;
                }
                    
                
            }
        }
        return flag;
         
    }
    public void search(char[][] board, String word, String ans,int ind,int i,int j,String arr[], int vist[][]){
        if(word.equals(ans)){
            arr[1]=ans;
            return;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || ind>=word.length()){
            return;
        }

        if(vist[i][j]==0 && board[i][j]==word.charAt(ind)){
            ans=ans+word.charAt(ind);
            vist[i][j]=1;
        }else{
            return;
        }

         search(board, word, ans,ind+1,i,j+1,arr,vist);
         search(board, word, ans,ind+1,i,j-1,arr,vist);
         search(board, word, ans,ind+1,i+1,j,arr,vist);
         search(board, word, ans,ind+1,i-1,j,arr,vist);

         vist[i][j]=0;
    }
}