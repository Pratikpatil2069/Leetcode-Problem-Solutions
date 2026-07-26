class Solution {
    public int largestInteger(int n, int s) {
        int num=0;
        int sum=0;
        if(s<10){
            num=s;
            sum=s;
            while(n>1){
                num=num*10;
                n--;
            }

        }else{
            num=9;
            sum=9;
            int diff=s-9;
            while(n>1){
                num=num*10;
                if(diff!=-1 && diff<10){
                    num+=diff;
                    sum+=diff;
                    diff=-1;
                }else if(diff!=-1){
                    num+=9;
                    sum+=9;
                    diff-=9;
                }
                n--;
            }
        }
        return (s==sum)?num:-1;
    }
}