1class Solution {
2    public long pickGifts(int[] gifts, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int g : gifts) {
5            pq.add(g);
6        }
7        for(int i = 0; i < k; i++) {
8            int max = pq.poll();
9            int rem = (int)Math.sqrt(max);
10            pq.add(rem);
11        }
12        long sum = 0;
13        while(!pq.isEmpty()) {
14            sum += pq.poll();
15        }
16
17        return sum;
18    }
19}