class Solution {
    public String decodeString(String s) {
        Stack<String> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                stack2.push(num);
                i--;
            } else {
                if (ch == ']') {
                    StringBuilder sb = new StringBuilder();

                    while (!stack1.isEmpty()) {
                        String ch1 = stack1.pop();
                        if (ch1.equals("[")) {
                            break;
                        }
                        sb.insert(0, ch1);
                    }

                    String str = sb.toString();

                    if (!stack2.isEmpty()) {
                        int count = stack2.pop();
                        for (int j = 1; j < count; j++) {
                            sb.append(str);
                        }
                    }

                    stack1.push(sb.toString());
                } else {
                    stack1.push(String.valueOf(ch));
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack1.isEmpty()) {
            ans.insert(0, stack1.pop());
        }

        return ans.toString();
    }
}