class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int []a,int []b){
                double fun1=(double)a[0]/a[1];
                double fun2=(double)b[0]/b[1];
                return Double.compare(fun1,fun2);
            }
        });
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                pq.add(new int[]{arr[i],arr[j]});
            }

        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.poll();
        
    }
}