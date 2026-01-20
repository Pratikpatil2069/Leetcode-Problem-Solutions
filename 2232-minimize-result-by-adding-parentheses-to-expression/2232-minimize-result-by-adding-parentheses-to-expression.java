class Solution {
    public String minimizeResult(String expression) {

        int plus = expression.indexOf('+');
        String left = expression.substring(0, plus);
        String right = expression.substring(plus + 1);

        int min = Integer.MAX_VALUE;
        String ans = "";

        for (int i = 0; i < left.length(); i++) {
            for (int j = 1; j <= right.length(); j++) {

                int a = (i == 0) ? 1 : Integer.parseInt(left.substring(0, i));
                int b = Integer.parseInt(left.substring(i));
                int c = Integer.parseInt(right.substring(0, j));
                int d = (j == right.length()) ? 1 : Integer.parseInt(right.substring(j));

                int val = a * (b + c) * d;

                if (val < min) {
                    min = val;
                    ans = left.substring(0, i)
                        + "("
                        + left.substring(i)
                        + "+"
                        + right.substring(0, j)
                        + ")"
                        + right.substring(j);
                }
            }
        }
        return ans;
    }
}
