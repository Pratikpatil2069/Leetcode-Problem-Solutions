class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiou";
        List<Character>list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (vowels.indexOf(ch) != -1) {
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        int ind=0;
        StringBuilder sb=new StringBuilder(s);
         for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (vowels.indexOf(ch) != -1) {
              sb.setCharAt(i, list.get(ind++));
            }
        }
    return sb.toString();

    }
}