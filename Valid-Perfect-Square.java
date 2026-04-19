1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int l = 1, h = num;
4
5        while (l <= h) {
6            int mid = (l + h) / 2;
7            long sq = (long) mid * mid;
8
9            if (sq == num) return true;
10            else if (sq < num) l = mid + 1;
11            else h = mid - 1;
12        }
13
14        return false;
15    }
16}