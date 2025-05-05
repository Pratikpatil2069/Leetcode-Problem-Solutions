class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer>list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                list.add(0);
                list.add(0);
                n=arr.length-1;
            }else{
              list.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        
    }
}