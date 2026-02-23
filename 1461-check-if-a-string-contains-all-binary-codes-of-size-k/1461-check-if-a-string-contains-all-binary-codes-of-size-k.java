class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k){
            return false;
        }
        int arr[]=new int[(int)Math.pow(2,k)];
        int ind=Integer.parseInt(s.substring(0,k),2);
        if(ind<arr.length){
            arr[ind]=1;
        }
        for(int i=1;i<=s.length()-k;i++){
            ind=Integer.parseInt(s.substring(i,i+k),2);
            if(ind<arr.length){
                arr[ind]=1;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum==arr.length;
        
    }
}