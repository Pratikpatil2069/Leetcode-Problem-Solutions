class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int min=count;
        
        for(int i=1;i<=blocks.length()-k;i++){
            
            if(blocks.charAt(i-1)=='W'){
                count--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                count++;
            }
            min=Math.min(min,count);

        }
        return min;
    }
}