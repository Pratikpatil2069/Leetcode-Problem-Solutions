class Solution {
    public String minRemoveToMakeValid(String s) {
        ArrayList<Integer>delete=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                delete.add(i);
            }else if(sb.charAt(i)==')'){
                if(delete.size()==0){
                    sb.deleteCharAt(i);
                    i--;
                }else{
                    delete.remove(delete.size()-1);
                }
                
            }
        }
        for(int i=delete.size()-1;i>=0;i--){
            sb.deleteCharAt(delete.get(i));
        }
        return sb.toString();
    }
}