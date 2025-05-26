class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       ArrayDeque<Integer>queue=new ArrayDeque<>();
       for(int i=0;i<students.length;i++){
        queue.offerLast(students[i]);
       }
       int i=0;
       for( i=0;i<sandwiches.length;i++){
        int sand=sandwiches[i];
        int count=0;
        while(!queue.isEmpty()){
            if(queue.peekFirst()==sand){
                queue.pollFirst();
                break;
            }else{
                queue.offerLast(queue.pollFirst());
                count++;
                if(count==queue.size()){
                    return queue.size();
                }
            }
        }
       }
       return queue.size();
    }
}