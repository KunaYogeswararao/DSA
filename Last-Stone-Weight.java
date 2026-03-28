1import java.util.*;
2
3class Solution {
4    public int lastStoneWeight(int[] stones) {
5
6        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
7
8        for(int stone : stones)
9        {
10            pq.add(stone);
11        }
12
13        while(pq.size() > 1)
14        {
15            int y = pq.poll(); // largest
16            int x = pq.poll(); // second largest
17
18            if(y != x)
19            {
20                pq.add(y - x);
21            }
22        }
23
24        if(pq.isEmpty())
25            return 0;
26
27        return pq.peek();
28    }
29}