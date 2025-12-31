class Solution {
    public List<String> stringSequence(String target) {
        List<String> list=new ArrayList<>();
        String str="";
        int ind=0;
        while(!str.equals(target)){
            char ch=target.charAt(ind++);
            char ch1='a';
            list.add(str+ch1);
            while(ch!=ch1){
                ch1++;
                list.add(str+ch1);
            }
            str+=ch;
        }
        return list;
    }
}