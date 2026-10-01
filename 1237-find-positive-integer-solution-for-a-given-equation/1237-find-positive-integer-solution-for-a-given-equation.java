class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int x = 1; x <= 1000; x++) {

            int low = 1;
            int high = 1000;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                int value = customfunction.f(x, mid);

                if (value == z) {
                    ans.add(Arrays.asList(x, mid));
                    break;
                } 
                else if (value < z) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }
}