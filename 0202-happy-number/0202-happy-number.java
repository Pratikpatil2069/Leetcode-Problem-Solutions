class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer>set=new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            while (n != 0) {
                int re = n % 10;
                sum = sum + re * re;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
                sum=0;
            }
        }
        return false;
    }
}