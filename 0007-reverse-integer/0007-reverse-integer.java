class Solution {
    public int reverse(int x) {
        boolean flag=false;
        if(x<0){
            x=x*(-1);
            flag=true;
        }
        int num=0;
        while(x>0){
            int re=x%10;
            if (num > Integer.MAX_VALUE / 10 || 
               (num == Integer.MAX_VALUE / 10 && re > 7)) {
                return 0;
            }
            num=num*10+re;
            x=x/10;
        }
        if(flag){
            num=num*(-1);
        }
       
        return num;
    }
}