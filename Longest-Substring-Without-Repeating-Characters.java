1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        HashSet<Character> set = new HashSet<>();
5        int l = 0;
6        int max = 0;
7        for(int r = 0; r < n; r++)
8        {
9            while(set.contains(s.charAt(r)))
10            {
11                set.remove(s.charAt(l));
12                l++;
13            }
14            set.add(s.charAt(r));
15            max = Math.max(max, r - l + 1);
16        }
17        return max;
18    }
19}