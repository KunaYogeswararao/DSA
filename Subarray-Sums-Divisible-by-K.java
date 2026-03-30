1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        hm.put(0,1);
5        int n=nums.length;
6        int sum=0;
7        int l=0;
8        int ans=0;
9        for(int i=0;i<n;i++)
10        {
11            sum+=nums[i];
12            int rem=sum%k;
13            if(rem<0)
14            {
15                rem+=k;
16            }
17            ans+=hm.getOrDefault(rem,0);
18            hm.put(rem,hm.getOrDefault(rem,0)+1);
19        }
20        return ans;
21    }
22}