class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);   // sort lexicographically
        
        List<String> result = new ArrayList<>();
        
        for (String f : folder) {
            if (result.isEmpty() || !f.startsWith(result.get(result.size() - 1) + "/")) {
                result.add(f);     // add only if not subfolder
            }
        }
        
        return result;
    }
}
