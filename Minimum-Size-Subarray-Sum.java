1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int r=0;
4        int sum=0;
5        int ans=Integer.MAX_VALUE;
6        int sum1=0;
7        for(int i=0;i<nums.length;i++)
8        {
9            sum+=nums[i];
10            while(sum>=target)
11            {
12                ans=Math.min(i-r+1,ans);
13                sum-=nums[r];
14                r++;
15            }
16        }
17        if(ans==Integer.MAX_VALUE)
18        {
19            return 0;
20        }
21        return ans;
22    }
23}