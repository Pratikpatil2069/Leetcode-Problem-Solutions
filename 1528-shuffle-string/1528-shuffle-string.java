class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            char ch=s.charAt(i);
            int ind=indices[i];
            arr[ind]=ch;
        }
        String str=new String(arr);
        return str;
        
    }
}