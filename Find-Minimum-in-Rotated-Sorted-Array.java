1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int l = 0;
5        int h = n - 1;
6
7        while (l < h) {
8            int mid = (l + h) / 2;
9            if (nums[mid] > nums[h]) {
10                l = mid + 1;
11            } else {
12                h = mid;
13            }
14        }
15
16        return nums[l];
17    }
18}