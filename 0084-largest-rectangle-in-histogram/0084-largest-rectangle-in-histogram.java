class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (heights[stack.peek()] <= heights[i]) {
                    stack.push(i);
                } else {
                    while (!stack.isEmpty() && heights[stack.peek()]  > heights[i]) {
                        int num = heights[stack.pop()];
                        if (stack.size() != 0) {
                            max = Math.max(max, num * (i - stack.peek() - 1));
                        } else {
                            max = Math.max(max, num * i);
                        }
                    }
                    stack.push(i);
                }
            }

        }
        
        while (!stack.isEmpty()) {
            int num = heights[stack.pop()];
            if (stack.size() != 0) {
                 max = Math.max(max, num * (heights.length - stack.peek()-1));
            } else {
                max = Math.max(max, num * heights.length);
            }
        }

        return max;
    }
}