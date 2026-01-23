class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        boolean flag=true;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
                if(count>9){
                     sb.append('9');
                sb.append(word.charAt(i));
                count=1;
                }
                flag=true;
            }else{
                sb.append(count);
                sb.append(word.charAt(i));
                count=1;
                flag=false;
            }
        }
        if(flag){
            sb.append(count);
            sb.append(word.charAt(word.length()-1));
        }
        if(word.length()>=2 && (word.charAt(word.length()-2)!=word.charAt(word.length()-1))){
            sb.append('1');
            sb.append(word.charAt(word.length()-1));
        }
        return sb.toString();
    }
}