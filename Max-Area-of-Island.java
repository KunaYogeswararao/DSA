1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int count=0;
4        int m=grid.length;
5        int n=grid[0].length;
6        for(int i=0;i<m;i++)
7        {
8            for(int j=0;j<n;j++)
9            {
10                if(grid[i][j]==1)
11                {
12                    int area=dfs(grid,i,j);
13                    count=Math.max(count,area);
14                }
15            }
16        }
17        return count;
18    }
19    public int dfs(int[][] grid,int i,int j)
20    {
21        int m=grid.length;
22        int n=grid[0].length;
23        int ans=0;
24        if(i>=0 && i<m && j>=0 && j<n)
25        {
26            if(grid[i][j]==1)
27            {
28                ans=1;
29                grid[i][j]=0;
30                ans+=dfs(grid,i,j+1);
31                ans+=dfs(grid,i,j-1);
32                ans+=dfs(grid,i-1,j);
33                ans+=dfs(grid,i+1,j);
34            }
35        }
36        return ans;
37    }
38}