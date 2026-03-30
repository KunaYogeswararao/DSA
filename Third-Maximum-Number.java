1class Solution {
2    public int thirdMax(int[] nums) {
3        int n = nums.length;
4        long l = Long.MIN_VALUE;
5        long sl = Long.MIN_VALUE;
6        long tl = Long.MIN_VALUE;
7
8        for(int i = 0; i < n; i++)
9        {
10            if(nums[i] == l || nums[i] == sl || nums[i] == tl) continue;
11
12            if(nums[i] > l)
13            {
14                tl = sl;
15                sl = l;
16                l = nums[i];
17            }
18            else if(nums[i] > sl)
19            {
20                tl = sl;
21                sl = nums[i];
22            }
23            else if(nums[i] > tl)
24            {
25                tl = nums[i];
26            }
27        }
28
29        if(tl == Long.MIN_VALUE)
30        {
31            return (int)l;
32        }
33
34        return (int)tl;
35    }
36}