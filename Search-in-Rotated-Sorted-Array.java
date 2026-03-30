1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        while(l<=r)
6        {
7            if(nums[l]==target) return l;
8            else if(nums[r]==target) return r;
9            l++;
10            r--;
11
12        }
13        return -1;
14    }
15}