1class Solution {
2    public int[] numberGame(int[] nums) {
3        int n=nums.length;
4        if(n==0)
5        {
6            return nums;
7        }
8        int[] arr=new int[n];
9        PriorityQueue<Integer> pq=new PriorityQueue<>();
10        for(int i=0;i<n;i++)
11        {
12            pq.add(nums[i]);
13        }
14        int i=0;
15        while(!pq.isEmpty())
16        {
17           int a=pq.poll();
18           int b=pq.poll();
19           arr[i++]=b;
20           arr[i++]=a;
21        }
22        return arr;
23    }
24}