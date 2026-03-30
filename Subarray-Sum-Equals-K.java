1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n=nums.length;
4        HashMap<Integer,Integer> hm=new HashMap<>();
5        hm.put(0,1);
6        int sum=0;
7        int ans=0;
8        for(int i=0;i<n;i++)
9        {
10            sum+=nums[i];
11            if(hm.containsKey(sum-k))
12            {
13                ans+=hm.get(sum-k);
14            }
15            hm.put(sum,hm.getOrDefault(sum,0)+1);
16        }
17        return ans;
18    }
19}