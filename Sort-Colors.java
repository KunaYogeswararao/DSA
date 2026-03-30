1class Solution {
2    public void sortColors(int[] nums) {
3        int n=nums.length;
4        int countZ=0;
5        int countO=0;
6        int countT=0;
7        for(int i=0;i<n;i++)
8        {
9            if(nums[i]==0)
10            {
11                countZ++;
12            }
13            else if(nums[i]==1)
14            {
15                countO++;
16            }
17            else
18            {
19                countT++;
20            }
21        }
22        for(int i=0;i<countZ;i++)
23        {
24            nums[i]=0;
25        }
26        for(int i=countZ;i<countZ+countO;i++)
27        {
28            nums[i]=1;
29        }
30        for(int i=countZ+countO;i<n;i++)
31        {
32            nums[i]=2;
33        }
34    }
35}