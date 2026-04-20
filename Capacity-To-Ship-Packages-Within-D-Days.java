1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int max=Integer.MIN_VALUE;
4        int sum=0;
5        for(int a:weights)
6        {
7            sum+=a;
8            max=Math.max(max,a);
9        }
10        while(max<=sum)
11        {
12            int mid=max+(sum-max)/2;
13            if(totalDays(mid,weights)<=days)
14            {
15                sum=mid-1;
16            }
17            else
18            {
19                max=mid+1;
20            }
21        }
22        return max;
23    }
24    public static int totalDays(int x,int[] arr)
25    {
26        int count=1;
27        int sum=0;
28        for(int i=0;i<arr.length;i++)
29        {
30            if(sum+arr[i]>x)
31            {
32                count++;
33                sum=arr[i];
34            }
35            else
36            {
37                sum+=arr[i];
38            }
39        }
40        return count;
41    }
42}