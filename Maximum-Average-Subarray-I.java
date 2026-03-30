1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        int maxsum=Integer.MIN_VALUE;
5        int l=0;
6        int n=nums.length;
7        for(int i=0;i<n;i++)
8        {
9            sum+=nums[i];
10            if(i-l+1==k)
11            {
12                maxsum=Math.max(maxsum,sum);
13                sum-=nums[l];
14                l++;
15            }
16        }
17        return (double)maxsum/k;
18    }
19}