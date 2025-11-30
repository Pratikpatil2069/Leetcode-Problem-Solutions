class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int arr1[]=new int [derived.length+1];
        int arr[]=new int [derived.length+1];
        if(derived[0]==1){
            arr1[0]=1;  
            arr1[1]=0;
            arr[0]=0;
            arr[1]=1;
        }else{
            arr1[0]=1;  
            arr1[1]=1;
            arr[0]=0;
            arr[1]=0;
        }
        for(int i=1;i<derived.length;i++){
           int num=derived[i];
            if(num==1){
                if(arr1[i]==0){
                    arr1[i+1]=1;
                    arr[i+1]=0;
                }else{
                    arr1[i+1]=0;
                    arr[i+1]=1;
                }
                
            }else{
                 if(arr1[i]==0){
                    arr1[i+1]=0;
                    arr[i+1]=1;
                }else{
                    arr1[i+1]=1;
                    arr[i+1]=0;
                }

            }
        }
       if ((arr[derived.length-1] ^ arr[0]) == derived[derived.length-1]) return true;

        // Circular check for arr1
        if ((arr1[derived.length-1] ^ arr1[0]) == derived[derived.length-1]) return true;

        return false;
    }
}