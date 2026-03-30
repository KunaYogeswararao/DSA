1class Solution {
2    public int findMaxLength(int[] nums) {
3        for(int i=0;i<nums.length;i++)
4        {
5            if(nums[i]==0)
6            {
7                 nums[i]=-1;
8            }
9        }
10        HashMap<Integer,Integer> hm=new HashMap<>();
11        hm.put(0,-1);
12        int sum=0;
13        int maxlen=0;
14        for(int i=0;i<nums.length;i++)
15        {
16            sum+=nums[i];
17            if(hm.containsKey(sum))
18            {
19                int last=hm.get(sum);
20                maxlen=Math.max(maxlen,i-last);
21            }
22            else{
23                hm.put(sum,i);
24            }
25        }
26        return maxlen;
27    }
28}