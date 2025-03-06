class Solution {
    public String truncateSentence(String s, int k) {
        int count=1;
        int ind=0;
        int flag=0;
        for(int i=0;i<s.length();i++){
             flag=0;
            if(s.charAt(i)==' '){
                flag=1;
                if(k==count){
                    ind=i;
                    break;
                }else{
                    count++;
                    
                }
                
            }
        }
        if(flag==0){
            return s;
        }else{
        return s.substring(0,ind);
        }
        
    }
}