class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String s="";
        boolean flag=false;
        for(int i=0;i<strs[0].length();i++){
            s=s+strs[0].charAt(i);
            
            for(int j=0;j<strs.length;j++){
                if(!strs[j].startsWith(s)){
                    flag=true;
                }   
            }
            if(flag){
                break;
            }
        }
        if(s==""){
            return s;
        }
        if(flag){
            return s.substring(0,s.length()-1);
        }else{
            return s.substring(0,s.length());
        }
        
    }
}