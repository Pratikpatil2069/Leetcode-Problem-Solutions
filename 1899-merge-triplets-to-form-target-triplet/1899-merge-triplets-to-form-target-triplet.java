class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        boolean flag = false;

        for (int i = 0; i < target.length; i++) {

            flag = false;

            for (int j = 0; j < triplets.length; j++) {

                if (triplets[j][0] > target[0] ||
                    triplets[j][1] > target[1] ||
                    triplets[j][2] > target[2]) {
                    continue;
                }

                int num = target[i];
                int num1 = triplets[j][i];

                if (num == num1) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return false;
            }
        }

        return true;
    }
}