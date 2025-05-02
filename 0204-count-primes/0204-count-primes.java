class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count=0;
        int[]box=new int[n];
        Arrays.fill(box,-1);
        for(int i=2;i*i<n;i++){
           
            for(int j=i*i;j<n;j=j+i){
                if((j%i)==0){
                    box[j]=1;
                }
            }

        }
        for(int i=2;i<n;i++){
            if(box[i]==-1){
                count++;
            }
        }
        return count;
        
    }
}