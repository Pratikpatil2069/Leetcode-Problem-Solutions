class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        
        while (i >= 0 || j >= 0 || carry != 0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1=num1.charAt(i)-'0';
                i--;
            }
             if(j>=0){
                n2=num2.charAt(j)-'0';
                j--;
            }
            
            
            int sum=n1+n2+carry;
            if(sum>9){
                carry=1;
            }else{
                carry=0;
            }
            sb.append((char)(sum%10+'0'));
        }
       
        return sb.reverse().toString();
    }
}