class Solution {
    public int[] diStringMatch(String s) {
        int arr[]=new int[s.length()+1];
        int num=0;
        int num1=arr.length-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=num;
                num++;
            }else{
                arr[i]=num1;
                num1--;
            }
        }
        arr[arr.length-1]=num1;
        return arr;
    }
}