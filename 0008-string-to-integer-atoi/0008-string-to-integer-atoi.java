class Solution {
    public int myAtoi(String s) {
          s = s.trim();
          StringBuilder sb = new StringBuilder();
          int ind = 0;
        boolean flag = false;
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '-' ) {
            flag = true;
            ind = 1;
        }
         if (s.charAt(0) == '+' ) {
            ind = 1;
        }
        for (int i = ind; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                break;
            }
        }
        while (!sb.isEmpty()) {
            if (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            } else {
                break;
            }
        }
        if (sb.length() == 0) {
            return 0;
        }
        try {
            if (flag) {
                return (-1) * Integer.parseInt(sb.toString());
            } else {
                return Integer.parseInt(sb.toString());
            }

        } catch (Exception e) {
            return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

    }
}