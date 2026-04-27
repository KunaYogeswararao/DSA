1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4
5        // count frequency
6        for (char c : s.toCharArray()) {
7            freq[c - 'a']++;
8        }
9
10        // find first unique
11        for (int i = 0; i < s.length(); i++) {
12            if (freq[s.charAt(i) - 'a'] == 1) {
13                return i;
14            }
15        }
16
17        return -1;
18    }
19}