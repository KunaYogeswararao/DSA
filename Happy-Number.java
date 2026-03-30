1class Solution {
2    public boolean isHappy(int n) {
3        int a=n;
4        HashSet<Integer> set=new HashSet<>();
5        while(a != 1 && a!=4)
6        {
7            int temp=a;
8            int ans=0;
9            while(temp != 0)
10            {
11            int digit=temp%10;
12            ans+=(digit*digit);
13            temp=temp/10;
14            }
15            a=ans;
16        }
17    return a==1;
18    }
19}