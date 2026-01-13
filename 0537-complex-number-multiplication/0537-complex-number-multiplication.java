class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int a1=0;
        int b1=0;
        int a2=0;
        int b2=0;
        for(int i=0;i<num1.length();i++){
            if(num1.charAt(i)=='+'){
                a1=Integer.parseInt(num1.substring(0,i));
                b1=Integer.parseInt(num1.substring(i+1,num1.length()-1));
                break;
            }

        }
         for(int i=0;i<num2.length();i++){
            if(num2.charAt(i)=='+'){
                a2=Integer.parseInt(num2.substring(0,i));
                b2=Integer.parseInt(num2.substring(i+1,num2.length()-1));
                break;
            }

        }
        int a=(a1*a2)-(b1*b2);
        int b=(a1*b2)+(b1*a2);
        return ""+a+'+'+b+'i';

    }
}