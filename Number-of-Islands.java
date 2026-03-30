1class Solution {
2    public int numIslands(char[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int count=0;
6        for(int i=0;i<m;i++)
7        {
8            for(int j=0;j<n;j++)
9            {  
10                if(grid[i][j]=='1')
11                {
12                    count++;
13                    dfs(grid,i,j);
14                }
15            }
16            
17        }  
18        return count;  
19    }
20    public void dfs(char[][] mat,int i,int j)
21    {
22        int m=mat.length;
23        int n=mat[0].length;
24        if(i>=0 && i<m && j>=0 && j<n  )
25        {
26            if(mat[i][j]=='1')
27             {
28                mat[i][j]='0';
29               dfs(mat,i,j+1);
30               dfs(mat,i+1,j);
31               dfs(mat,i-1,j);
32               dfs(mat,i,j-1);
33
34            }
35    }
36}
37}