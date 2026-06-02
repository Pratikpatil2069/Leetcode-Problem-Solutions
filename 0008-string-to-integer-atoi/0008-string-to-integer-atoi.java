class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        int ind = num(s, (s.charAt(0) == '-' || s.charAt(0) == '+')? 1 : 0);
        if (ind == 0) {
            return 0;
        }
        if(ind==1 && (s.charAt(0) == '-' || s.charAt(0) == '+') ){
            return 0;
        }
        try {
            return Integer.parseInt(s.substring(0,ind));
        } catch (NumberFormatException e) {
            if (s.startsWith("-")) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
    }

    public int num(String s, int left) {
        if (left >= s.length()) {
            return left;
        }
        char ch = s.charAt(left);
        if (!Character.isDigit(ch)) {
            return left;
        }
        return num(s, left + 1);
    }
}