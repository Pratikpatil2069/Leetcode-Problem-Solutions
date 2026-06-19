class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> set = new HashSet<>();

        for(String word : words){
            set.add(getSignature(word));
        }

        return set.size();
    }

    public String getSignature(String s){
        int even[] = new int[26];
        int odd[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                even[s.charAt(i) - 'a']++;
            } else {
                odd[s.charAt(i) - 'a']++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int x : even){
            sb.append(x).append("#");
        }

        sb.append("|");

        for(int x : odd){
            sb.append(x).append("#");
        }

        return sb.toString();
    }
}