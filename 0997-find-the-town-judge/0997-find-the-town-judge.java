class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int v1=trust[i][0];
            int v2=trust[i][1];
            arr[v1]--;
            arr[v2]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}