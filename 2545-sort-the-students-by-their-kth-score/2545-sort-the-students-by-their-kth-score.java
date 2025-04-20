class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
                return b[0]-a[0];
            }
        });
       int ind=k;
       for(int i=0;i<score.length;i++){
        pq.add(new int[]{score[i][k],i});
       }
       int arr[][]=new int[score.length][score[0].length];
       for(int i=0;i<score.length;i++){
        int num[]=pq.poll();
        int ind1=num[1];
        for(int j=0;j<score[0].length;j++){
            arr[i][j]=score[ind1][j];
        }
       }
        return arr;
    }
}