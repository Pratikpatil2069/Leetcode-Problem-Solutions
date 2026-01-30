class Solution {
    public int numberOfBeams(String[] bank) {
        
        int prev=0;
        int count=0;
        int total=0;
        for(int i=0;i<bank.length;i++){
            String s=bank[i];
            for(char c :s.toCharArray()){
                if(c=='1'){
                    count++;
                }
            }

            total+=count*prev;
            if(count>0){
                prev=count;
            }
          
             count=0;    
            
        }
        return total;
    }
}