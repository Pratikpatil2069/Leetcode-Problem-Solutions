class Solution {
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int left = 0;
        int rigth = 0;
        int num = 2;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() < k) {
                left = 0;
                rigth = s.length() - 1;

            } else {
                left = i;
                rigth = Math.min(left + k - 1,s.length()-1);
            }
            while (left < rigth) {
                char c = ch[left];
                ch[left] = ch[rigth];
                ch[rigth] = c;
                left++;
                rigth--;
            }
            i = num * k - 1;
            num++;
        }
        return new String(ch);
    }
}