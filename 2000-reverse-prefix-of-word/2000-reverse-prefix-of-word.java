class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=-1;
      for(int i=0;i<word.length();i++){
        if(word.charAt(i)==ch){
            ind =i;
            break;
        }
      }
      if(ind!=-1){
        StringBuilder sb=new StringBuilder(word);
        sb.replace(0,ind+1,new StringBuilder(sb.substring(0,ind+1)).reverse().toString());
        return sb.toString();

      }else{
        return word;
      }
    }
}