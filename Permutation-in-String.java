1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        HashMap<Character,Integer> hm1=new HashMap<>();
4        HashMap<Character,Integer> hm2=new HashMap<>();
5
6        for(int i=0;i<s1.length();i++){
7            char ch=s1.charAt(i);
8            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
9        }
10
11        int n=s1.length();
12        int r=0;
13
14        for(int i=0;i<s2.length();i++){
15            char ch=s2.charAt(i);
16            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
17
18            if(i-r+1==n){
19                if(hm1.equals(hm2)) return true;
20
21                char left = s2.charAt(r);
22                hm2.put(left, hm2.get(left) - 1);
23
24                if(hm2.get(left) == 0){
25                    hm2.remove(left);
26                }
27
28                r++;
29            }
30        }
31        return false;
32    }
33}