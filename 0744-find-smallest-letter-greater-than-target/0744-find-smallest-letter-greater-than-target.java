class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target ||letters[0]>target){
            return letters[0];
        }
        Set<Character>set=new LinkedHashSet<>();
        for(char i:letters){
            set.add(i);
        }
        int left=0;
        int right=letters.length-1;
        int flag=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]==target && mid!=letters.length-1 && letters[mid+1]!=target){
                return letters[mid+1];
            }
            if(letters[mid]==target){
                flag=1;
                break;
            }
            if(letters[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(!set.contains(target)){
            return letters[left];
        }
        if (flag == 1) {
            while (!set.isEmpty()) {
                char current = set.iterator().next();
                set.remove(current);
                if (current == target) {
                    break;  
                }
            }
        }
        return set.iterator().next();
    }
}