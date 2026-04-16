1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int ans=0;
5        int l=0;
6        int r=n-1;
7        while(l<r)
8        {
9            if(height[l]<height[r])
10            {
11                int w=r-l;
12                ans=Math.max(ans,w*(height[l]));
13                l++;
14            }
15            else
16            {
17              int w=r-l;
18             ans=Math.max(ans,w*(height[r]));
19             r--;
20            }
21        }
22        return ans;
23    }
24}