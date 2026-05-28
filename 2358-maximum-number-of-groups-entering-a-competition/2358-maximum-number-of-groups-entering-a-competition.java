class Solution {
    public int maximumGroups(int[] grades) {
        int count=0;
        int c=0;
        int prevC=0;
        for(int i=0;i<grades.length;i++){
            c++;
            if(c>prevC){
                count++;
                prevC=c;
                c=0;
            }

        }
        return count;
    }
}