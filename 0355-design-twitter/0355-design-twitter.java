class Twitter {

    HashMap<Integer, List<int[]>> tweets;
    HashMap<Integer, HashSet<Integer>> map;
    int time = 0;

    public Twitter() {
        tweets = new HashMap<>();
        map = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

        tweets.putIfAbsent(userId, new ArrayList<>());

        tweets.get(userId).add(new int[]{time++, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        if (tweets.containsKey(userId)) {
            for (int[] tweet : tweets.get(userId)) {
                pq.offer(tweet);
            }
        }

        if (map.containsKey(userId)) {

            for (int followee : map.get(userId)) {

                if (tweets.containsKey(followee)) {
                    for (int[] tweet : tweets.get(followee)) {
                        pq.offer(tweet);
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        while (!pq.isEmpty() && list.size() < 10) {
            list.add(pq.poll()[1]);
        }

        return list;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        map.putIfAbsent(followerId, new HashSet<>());

        map.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        if (map.containsKey(followerId)) {
            map.get(followerId).remove(followeeId);
        }
    }
}