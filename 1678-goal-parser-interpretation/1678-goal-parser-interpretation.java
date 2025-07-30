class Solution {
    public String interpret(String command) {
        String s1="";
        int n=s1.length();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                s1=s1+command.substring(i,i+1);
            }else if(command.substring(i,i+2).equals("()")){
                s1=s1+"o";
                if((i+2)==n){
                    break;
                }else{
                    i=i+1;
                }
            }else if(command.substring(i,i+4).equals("(al)")){
                s1=s1+"al";
                if((i+4)==n){
                    break;
                }else{
                    i=i+3;
                }
            }
        }
        return s1;
    }
}