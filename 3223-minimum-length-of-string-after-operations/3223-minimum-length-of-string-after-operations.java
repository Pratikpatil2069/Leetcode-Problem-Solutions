class Solution {
    public int minimumLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length()-1;i++){
            char ch=sb.charAt(i);
            int ind1=-1;
            int ind2=-1;
            for(int j=0;j<i;j++){
                if(sb.charAt(j)==ch){
                    ind1=j;
                    break;
                }
            }
            for(int k=i+1;k<sb.length();k++){
                if(sb.charAt(k)==ch){
                    ind2=k;
                    break;
                }
            }
            if(ind1!=-1 && ind2!=-1){
                sb.deleteCharAt(ind2);
                sb.deleteCharAt(ind1);
                
                i--;
            }
        }
     return sb.length();   
    }
}