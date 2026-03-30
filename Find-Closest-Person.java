1class Solution {
2    public int findClosest(int x, int y, int z) {
3        if(Math.abs(z-x) < Math.abs(z-y))
4        {
5            return 1;
6        }
7        if(Math.abs(z-y) < Math.abs(z-x))
8        {
9            return 2;
10        }
11        return 0;
12    }
13}