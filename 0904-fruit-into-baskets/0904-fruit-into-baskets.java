class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
        int k=0;
        int max=0;
        while(true){
        int num=fruits[k];
        int num1=0;
        int count=0;
        for( i=k;i<fruits.length;i++){
            if(fruits[i]==num){
                count++;
            }else{
                count++;
                num1=fruits[i];
                k=i;
                break;
            }
        }
        int j=0;
        for( j=i+1;j<fruits.length;j++){
            if(fruits[j]==num || fruits[j]==num1){
                count++;
            }else{
                break;
            }
        }
        max=Math.max(max,count);
        if(i==fruits.length || j==fruits.length){
            break;
        }
        }
        return max;
    }
}