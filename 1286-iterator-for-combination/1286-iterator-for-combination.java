class CombinationIterator {
    List<String>list;
    int ind;
    public CombinationIterator(String characters, int combinationLength) {
        list=new ArrayList<>();
        ind=0;
        for (int mask = 0; mask < (1 << characters.length()); mask++) {

            if (Integer.bitCount(mask) ==combinationLength ) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < characters.length(); i++) {
                    if ((mask & (1 << i)) != 0) {
                        sb.append(characters.charAt(i));
                    }
                }

                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        
    }
    
    public String next() {
        return list.get(ind++);
    }
    
    public boolean hasNext() {
        if(list.size()<=ind){
            return false;
        }
        return true;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */