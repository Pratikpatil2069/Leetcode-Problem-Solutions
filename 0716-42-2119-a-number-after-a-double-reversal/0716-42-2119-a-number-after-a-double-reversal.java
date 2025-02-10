class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse = 0;
        int dup = 0;
        int orig = num;
        if (num == 0) {
            return true;
        }
        while (num != 0) {
            int re = num % 10;
            reverse = reverse * 10 + re;
            num = num / 10;
        }
        while (reverse != 0) {
            dup = dup * 10 + reverse % 10;
            reverse = reverse / 10;
        }
        if (dup == orig) {
            return true;
        } else {
            return false;
        }
    }
}