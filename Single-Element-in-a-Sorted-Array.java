1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3      int n=nums.length;
4      int ans=0;
5      for(int i=0;i<n;i++)
6      {
7        ans^=nums[i];
8      }
9      return ans;
10    }
11}