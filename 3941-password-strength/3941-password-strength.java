class Solution {
    public int passwordStrength(String password) {
        int count=0;
        Set<Character>set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!set.contains(ch)){
                 if(Character.isDigit(ch)){
                count+=3;
            }else if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                     count+=2;
                }else{
                     count+=1;
                }
            }else{
                 count+=5;
            }
            }
           
            set.add(ch);
        }
        return count;
    }
}