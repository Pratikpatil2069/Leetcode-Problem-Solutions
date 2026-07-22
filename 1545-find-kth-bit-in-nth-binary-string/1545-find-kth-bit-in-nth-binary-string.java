class Solution {
    public char findKthBit(int n, int k) {
        return findBit(k,"0");
    }
    private char findBit(int k,String str){
        if(str.length()>=k){
            return str.charAt(k-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        sb.reverse();
        str+="1"+sb;
        return findBit(k,str);
    }
}