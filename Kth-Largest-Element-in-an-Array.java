1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5
6        for(int num : nums)
7        {
8            pq.add(num);
9
10            if(pq.size() > k)
11            {
12                pq.poll();
13            }
14        }
15
16        return pq.peek();
17    }
18}