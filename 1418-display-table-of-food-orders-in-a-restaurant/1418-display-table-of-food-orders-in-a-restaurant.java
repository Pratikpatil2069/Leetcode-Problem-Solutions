class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {

        // Sorted food items
        Set<String> foodSet = new TreeSet<>();

        // tableNumber -> (foodItem -> count)
        Map<Integer, Map<String, Integer>> tableMap = new TreeMap<>();

        // Step 1 & 2: collect food items and count orders
        for (List<String> order : orders) {
            int table = Integer.parseInt(order.get(1));
            String food = order.get(2);

            foodSet.add(food);

            tableMap.putIfAbsent(table, new HashMap<>());
            Map<String, Integer> foodCount = tableMap.get(table);

            foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
        }

        // Step 3: build result
        List<List<String>> result = new ArrayList<>();

        // Header row
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(foodSet);
        result.add(header);

        // Data rows
        for (int table : tableMap.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));

            Map<String, Integer> foodCount = tableMap.get(table);
            for (String food : foodSet) {
                row.add(String.valueOf(foodCount.getOrDefault(food, 0)));
            }

            result.add(row);
        }

        return result;
    }
}
