class Solution {
    public String decodeCiphertext(String encodedText, int rows) {

        if (rows == 0 || encodedText.length() == 0)
            return "";

        int cols = encodedText.length() / rows;

        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int count = 0;

        for (int i = 0; i < encodedText.length(); i++) {
            str.append(encodedText.charAt(i));
            count++;

            if (count == cols) {
                list.add(str.toString());
                str.setLength(0);
                count = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int start = 0; start < cols; start++) {
            int r = 0;
            int c = start;

            while (r < rows && c < cols) {
                sb.append(list.get(r).charAt(c));
                r++;
                c++;
            }
        }

        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}