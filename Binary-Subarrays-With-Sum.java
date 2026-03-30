1class Solution {
2
3    public int numSubarraysWithSum(int[] nums, int goal) {
4        return atMost(nums, goal) - atMost(nums, goal - 1);
5    }
6
7    public int atMost(int[] nums, int goal) {
8        if(goal < 0) return 0;
9
10        int l = 0;
11        int sum = 0;
12        int count = 0;
13
14        for(int r = 0; r < nums.length; r++) {
15
16            sum += nums[r];
17
18            while(sum > goal) {
19                sum -= nums[l];
20                l++;
21            }
22
23            count += r - l + 1;
24        }
25
26        return count;
27    }
28}