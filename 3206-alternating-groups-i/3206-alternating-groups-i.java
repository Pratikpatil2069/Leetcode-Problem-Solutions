class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int i=0;
        for( i=0;i<colors.length-2;i++){
           int one=i;
           int two=i+1;
           int three=i+2;
           if(colors[one]==colors[three] && colors[two]!=colors[one]){
            count++;
           }
        }
         if(colors[i]==colors[0] && colors[i+1]!=colors[i]){
            count++;
           }
            if(colors[i+1]==colors[1] && colors[0]!=colors[i+1]){
            count++;
           }
        
        return count;
        
    }
}