class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=new int [boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int left=0;
            int right=boxes.length()-1;
            int count=0;
            while(left<=i){
                if(boxes.charAt(left)=='1'){
                    count=count+(i-left);
                }
                left++;
            }
            while(right>=i){
                if(boxes.charAt(right)=='1'){
                    count=count+(right-i);
                }
                right--;

            }
            arr[i]=count;
        }
        return arr;
        
    }
}