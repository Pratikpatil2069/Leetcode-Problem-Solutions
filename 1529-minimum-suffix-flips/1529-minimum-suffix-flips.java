class Solution {
    public int minFlips(String target) {
        int count=0;
        boolean flag=false;
        for(int i=target.length()-1;i>=0;i--){
            if(i==0){
                if(target.charAt(i)=='1'){
                    if(flag){
                        count+=2;
                    }else{
                        count++;
                    }
                }
                break;
            }
            if(target.charAt(i)=='0'){
                flag=true;
                continue;
            }else{
                if(target.charAt(i-1)=='1'){
                    continue;
                }else{
                    if(flag){
                        count+=2;
                        flag=false;
                    }else{
                        count++;
                    }
                    
                }
            }
        }
        if(!flag && count==0){
            return 1;
        }
        return count;
        
    }
}