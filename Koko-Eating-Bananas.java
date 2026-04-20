1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3       int low=1;
4       int high=0;
5       for(int a:piles)
6       {
7        high=Math.max(high,a);
8       }
9       while(low<=high)
10       {
11        int mid=low+(high-low)/2;
12        if(totalHours(mid,piles)<=h)
13        {
14            high=mid-1;
15        }
16        else
17        {
18            low=mid+1;
19        }
20       }
21       return low;
22    }
23    public static long totalHours(int x,int[] arr)
24    {
25        long tH=0;
26        for(int a:arr)
27        {
28            tH+=(a+x-1)/x;
29        }
30        return tH;
31    }
32}