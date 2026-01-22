class Solution {
    public List<String> printVertically(String s) {
        List<String>list=new ArrayList<>();
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                 String str="";
                if(list.size()==0){
                    list.add(str+s.charAt(i));
                    ind++;
                }else if(ind==list.size()){
                    for(int j=0;j<list.get(ind-1).length()-1;j++){ str+=" "; } list.add(str+s.charAt(i)); ind++;
                }else{
                    str=list.get(ind);
                    list.set(ind, str + s.charAt(i));
                    ind++;
                }
            }else{
                
                for(int k=ind;k<list.size();k++){
                    list.set(k,  list.get(k)+" ");
                }
                ind=0;
            }
        }
         for (int i = 0; i < list.size(); i++) {
            String row = list.get(i);
            int end = row.length() - 1;
            while (end >= 0 && row.charAt(end) == ' ') {
                end--;
            }
            list.set(i, row.substring(0, end + 1));
        }

        return list;
    }
}