1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int n = nums.length;
4        int a1 = -1, a2 = -1;
5
6        // first occurrence
7        int l = 0, h = n - 1;
8        while (l <= h) {
9            int mid = (l + h) / 2;
10
11            if (nums[mid] == target) {
12                a1 = mid;
13                h = mid - 1; // move left
14            } else if (nums[mid] < target) {
15                l = mid + 1;
16            } else {
17                h = mid - 1;
18            }
19        }
20
21        // last occurrence
22        l = 0;
23        h = n - 1;
24        while (l <= h) {
25            int mid = (l + h) / 2;
26
27            if (nums[mid] == target) {
28                a2 = mid;
29                l = mid + 1; // move right
30            } else if (nums[mid] < target) {
31                l = mid + 1;
32            } else {
33                h = mid - 1;
34            }
35        }
36
37        return new int[]{a1, a2};
38    }
39}