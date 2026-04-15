1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int n=nums.length;
4        int l=0;
5        int ans=0;
6        int temp=0;
7        for(int r=0;r<n;r++)
8        {
9            if(nums[r]==0)
10            {
11                temp++;
12            }
13            while(temp>k)
14            {
15                if(nums[l]==0)
16                {
17                    temp--;
18                }
19                l++;
20            }
21            ans=Math.max(ans,r-l+1);
22        }
23        return ans;
24    }
25}