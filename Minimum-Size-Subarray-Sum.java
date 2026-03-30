1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n=nums.length;
4        int l=0;
5        int ans=Integer.MAX_VALUE;
6        int temp=0;
7        for(int r=0;r<n;r++)
8        {
9            temp+=nums[r];
10            while(temp>=target)
11            {
12                ans=Math.min(ans,r-l+1);
13                temp-=nums[l];
14                l++;
15            }
16        }
17        if(ans==Integer.MAX_VALUE)
18        {
19            return 0;
20        }
21        return ans;
22    }
23}