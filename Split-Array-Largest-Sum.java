1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low=0;
4        int high=0;
5        for(int a:nums)
6        {
7            low=Math.max(low,a);
8            high+=a;
9        }
10        while(low<=high)
11        {
12            int mid=low+(high-low)/2;
13            if(split(mid,nums)<=k)
14            {
15                high=mid-1;
16            }
17            else
18            {
19                low=mid+1;
20            }
21        }
22        return low;
23    }
24    public static int split(int x,int[] arr)
25    {
26        int sum=0;
27        int ans=1;
28        for(int a:arr)
29        {
30            if(sum+a>x)
31            {
32                ans++;
33                sum=a;
34            }
35            else
36            {
37                sum+=a;
38            }
39        }
40        return ans;
41    }
42}