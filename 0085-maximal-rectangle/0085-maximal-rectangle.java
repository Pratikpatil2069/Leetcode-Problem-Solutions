class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        int arr[]=new int[matrix[0].length];
         for (int k = 0; k < matrix.length; k++) {

            for (int i = 0; i < matrix[0].length; i++) {

                if (matrix[k][i] == '1') {
                    arr[i]++;
                } else {
                    arr[i] = 0;
                }
            }

            max = Math.max(max, largestRectangleArea(arr));
        }
        return max;
    }

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
                    while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
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
                max = Math.max(max, num * (heights.length - stack.peek() - 1));
            } else {
                max = Math.max(max, num * heights.length);
            }
        }

        return max;
    }
}