class Solution {
    public String reversePrefix(String word, char ch) {
       int a=0;
       int b=word.indexOf(ch);
       char arr[]=word.toCharArray();
       while(a<b){
       
          char s=arr[a];
          arr[a]=arr[b];
          arr[b]=s;
          a++;
          b--;
        
       }
       return new String(arr);
    }
}