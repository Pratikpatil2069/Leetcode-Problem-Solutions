class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<seats.length;i++){
            set.add(seats[i]);
        }
        int n=set.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+students[i];
        }
        int sum1=0;
        for(int j:set){
            sum1=sum1+j;
        }
        return Math.abs(sum-sum1);
    }
}