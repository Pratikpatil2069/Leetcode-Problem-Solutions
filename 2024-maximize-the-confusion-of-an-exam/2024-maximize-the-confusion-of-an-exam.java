class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < answerKey.length(); i++) {
            if (answerKey.charAt(i) == 'T') {
                list.add(i);

                if (list.size() > k) {
                    left = list.get(0) + 1;
                    list.remove(0);
                }
            }

            max = Math.max(max, i - left + 1);
        }
        list.clear();
        left = 0;
        int max1=0;
        for (int i = 0; i < answerKey.length(); i++) {
            if (answerKey.charAt(i) == 'F') {
                list.add(i);

                if (list.size() > k) {
                    left = list.get(0) + 1;
                    list.remove(0);
                }
            }

            max1 = Math.max(max1, i - left + 1);
        }
        return Math.max(max, max1);
    }
}