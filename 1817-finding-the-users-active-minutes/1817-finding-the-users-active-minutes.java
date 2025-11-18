class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int arr[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        
        Set<String> set = new HashSet<>();

        for (int i = 0; i < logs.length; i++) {
            set.add(logs[i][0] + "-" + logs[i][1]); 
        }

        
        for (String s : set) {
            String parts[] = s.split("-");
            int user = Integer.parseInt(parts[0]);

            map.put(user, map.getOrDefault(user, 0) + 1);
        }

        
        for (int key : map.keySet()) {
            int val = map.get(key);
            arr[val - 1] = arr[val - 1] + 1;
        }

        return arr;
    }
}
