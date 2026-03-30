1import java.util.*;
2
3class Solution {
4    public boolean checkSubarraySum(int[] nums, int k) {
5        HashMap<Integer, Integer> hm= new HashMap<>();
6        hm.put(0, -1);
7        int sum = 0;
8        for(int i = 0; i < nums.length; i++) {
9            sum += nums[i];
10            int rem=sum%k;
11         if(hm.containsKey(rem))
12         {
13            if(i-hm.get(rem)>=2)
14            {
15                return true;
16            }
17         }
18         else
19         {
20            hm.put(rem,i);
21         }
22        }
23        return false;
24    }
25}