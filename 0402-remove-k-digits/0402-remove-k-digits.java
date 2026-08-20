class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';

            if (stack.isEmpty() || k == 0) {
                stack.push(n);
            } else {
                while (!stack.isEmpty() && stack.peek() > n && k != 0) {
                    stack.pop();
                    k--;
                }
                stack.push(n);
            }
        }

        while (k != 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        // Remove leading zeros
        int i = 0;
        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i++;
        }

        if (sb.length() == 0) {
            return "0";
        }

        return sb.substring(i);
    }
}