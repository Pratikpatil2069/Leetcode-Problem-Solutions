import java.util.*;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) { // if already in 'seen', then it's a duplicate
                duplicates.add(num);
            }
        }

        int xor = 0;
        for (int num : duplicates) {
            xor ^= num;
        }

        return xor;
    }
}
