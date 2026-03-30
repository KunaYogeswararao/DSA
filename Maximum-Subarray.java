1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int ans=nums[0];
5        for(int i=0;i<nums.length;i++)
6        {
7            sum+=nums[i];
8            ans=Math.max(ans,sum);
9           if(sum<0)
10            {
11                sum=0;
12            }
13        }
14        return ans;
15    }
16}