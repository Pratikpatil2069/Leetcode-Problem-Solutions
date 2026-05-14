class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        while (!map.isEmpty()) {

            List<Character> list = new ArrayList<>();
            int cycle = n + 1;

            while (cycle > 0 && !map.isEmpty()) {

                Character maxTask = null;
                int maxFreq = 0;

                for (Character ch : map.keySet()) {

                    if (list.contains(ch)) {
                        continue;
                    }

                    if (map.get(ch) > maxFreq) {
                        maxFreq = map.get(ch);
                        maxTask = ch;
                    }
                }

                if (maxTask == null) {
                    time++;
                    cycle--;
                    continue;
                }

                list.add(maxTask);

                if (map.get(maxTask) == 1) {
                    map.remove(maxTask);
                } else {
                    map.put(maxTask, map.get(maxTask) - 1);
                }

                time++;
                cycle--;
            }

            if (!map.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}