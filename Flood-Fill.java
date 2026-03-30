1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int startColor = image[sr][sc];
4        if(startColor != color) {
5            dfs(image,sr, sc, startColor, color);
6        }
7        return image;
8    }
9    public void dfs(int[][] mat, int i, int j, int startColor, int color) {
10        int m = mat.length;
11        int n = mat[0].length;
12        if(i >= 0 && i < m && j >= 0 && j < n) {
13            if(mat[i][j] == startColor) {
14                mat[i][j] = color;
15                dfs(mat,  i, j+1, startColor, color);
16                dfs(mat,  i+1, j, startColor, color);
17                dfs(mat,  i-1, j, startColor, color);
18                dfs(mat,  i, j-1, startColor, color);
19            }
20        }
21    }
22}