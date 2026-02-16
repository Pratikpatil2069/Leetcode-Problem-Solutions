import java.util.*;

class Solution {

    public int minimumPairRemoval(int[] nums) {

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        if (isSorted(list)) {
            return count;
        }

        while (list.size() > 1) {

            int min = Integer.MAX_VALUE;
            int ind = -1;

            // Find minimum pair sum
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < min) {
                    min = sum;
                    ind = i;
                }
            }

            // Replace first element with sum
            list.set(ind, min);

            // Remove next element
            list.remove(ind + 1);

            count++;

            if (isSorted(list)) {
                return count;
            }
        }

        return count;
    }

    private boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
