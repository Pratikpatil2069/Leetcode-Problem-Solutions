class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(double []a,double []b){
                return Double.compare(b[2], a[2]);
            }
        });
        for(int i=0;i<classes.length;i++){
            pq.add(new double[]{(double)classes[i][0],(double)classes[i][1],(((double)(classes[i][0]+1)/(classes[i][1]+1))-((double)(classes[i][0])/(classes[i][1])))});
        }
        while(extraStudents>0){
            double arr[]=pq.poll();
            arr[0]=arr[0]+1;
            arr[1]=arr[1]+1;
            arr[2]=((arr[0]+1)/(arr[1]+1))-((arr[0])/(arr[1]));
            pq.add(arr);
            extraStudents--;
        }
        int size=pq.size();
        double sum=0;
        while(!pq.isEmpty()){
            double a[]=pq.poll();
            sum+=a[0]/a[1];
        }
        return sum/size;
    }
}