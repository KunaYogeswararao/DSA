1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        ArrayList<Integer> list=new ArrayList<>();
4        HashMap<Character,Integer> hm=new HashMap<>();
5        HashMap<Character,Integer> hm1=new HashMap<>();
6        int n=p.length();
7        int m=s.length();
8        for(int i=0;i<n;i++)
9        {
10            char ch=p.charAt(i);
11            hm.put(ch,hm.getOrDefault(ch,0)+1);
12        }
13        int l=0;
14        for(int i=0;i<m;i++)
15        {
16            char right=s.charAt(i);
17            hm1.put(right,hm1.getOrDefault(right,0)+1);
18            if(i-l+1==n)
19            {
20                if(hm1.equals(hm))
21                {
22                    list.add(l);
23                }
24                char left=s.charAt(l);
25                hm1.put(left,hm1.get(left)-1);
26                if(hm1.get(left)==0)
27                {
28                     hm1.remove(left);
29                }
30                l++;
31            }
32        }
33        return list;
34    }
35}