
class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{0,nums[i], i});
        }

        for(int j=0;j<list.size();j++) {
            int a[] = list.get(j);
            int num = a[1];
            List<Integer> list1 = new ArrayList<>();

            while (num > 0) {
                int re = num % 10;
                list1.add(re);
                num /= 10;
            }

            int max = 0;
            Collections.sort(list1, Collections.reverseOrder());

            for (int i = 0; i < list1.size(); i++) {
                max = max * 10 + list1.get(i);
            }
            if(max>a[0]){
                int diff=max-a[1];
                a[0] = diff;
                a[1]=max;
                pq.add(a);
            } 
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < k; i++) {
            if(!pq.isEmpty()){
                int arrr[] = pq.poll();
                sum += arrr[1];
                set.add(arrr[2]);
            }else{
                break;
            }
            
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
