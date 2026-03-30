1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        hm.put(0,1);
5        int sum=0;
6        int ans=0;
7        for(int i=0;i<nums.length;i++)
8        {
9            sum+=nums[i];
10            if(hm.containsKey(sum-goal))
11            {
12                ans+=hm.get(sum-goal);
13            }
14            hm.put(sum,hm.getOrDefault(sum,0)+1);
15        }
16        return ans;
17    }
18}