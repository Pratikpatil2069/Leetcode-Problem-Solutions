class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int result[]=new int[arr.length];
        result[0]=arr[0];
       for(int i=1;i<arr.length;i++){
        result[i]=result[i-1]^arr[i];
       }
       int ans[]=new int[queries.length];
       for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(start==0){
                ans[i]=result[end];
            }else{
                ans[i]=result[end]^result[start-1];
            }
       }
        
           
        return ans;
    }
}