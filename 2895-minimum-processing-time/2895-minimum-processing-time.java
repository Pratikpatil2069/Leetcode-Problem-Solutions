class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks,Collections.reverseOrder());
        Collections.sort(processorTime);
        int max=0;
        int ind=0;
        for(int i=0;i<processorTime.size();i++){
            for(int j=ind;j<ind+4;j++){
                max=Math.max(processorTime.get(i)+tasks.get(j),max);
            }
            ind+=4;
        }
        return max;
        
    }
}