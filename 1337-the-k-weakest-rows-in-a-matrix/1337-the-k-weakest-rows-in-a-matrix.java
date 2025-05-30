class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int[]a,int[]b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }else{
                    return a[0]-b[0];
                }
            }
        });
        int r=0;
        int c=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    break;
                }else{
                    count++;
                }
            }
            pq.add(new int[]{count,i});
        }
        int arr[]=new int[k];
        int ind=0;
        while(k!=0){
            int nums[]=pq.poll();
            arr[ind++]=nums[1];
            k--;
        }
        return arr;
    }
}