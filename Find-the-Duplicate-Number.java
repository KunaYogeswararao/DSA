1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = 0;
4        int fast = 0;
5
6        // Step 1: Detect cycle
7        do {
8            slow = nums[slow];
9            fast = nums[nums[fast]];
10        } while (slow != fast);
11
12        // Step 2: Find duplicate (cycle start)
13        slow = 0;
14
15        while (slow != fast) {
16            slow = nums[slow];
17            fast = nums[fast];
18        }
19
20        return slow;
21    }
22}