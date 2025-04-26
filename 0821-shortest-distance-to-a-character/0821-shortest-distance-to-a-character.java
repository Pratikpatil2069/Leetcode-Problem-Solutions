class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer>list=new ArrayList<>();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            list.add(i);
        }
     }   
     int arr[]=new int[s.length()];
     for(int i=0;i<s.length();i++){
        int min=Integer.MAX_VALUE;
        for(int j=0;j<list.size();j++){
            min=Math.min(min,Math.abs(list.get(j)-i));
        }
        arr[i]=min;
     }
     return arr;
    }
}