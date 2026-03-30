1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            adj.add(new ArrayList<>());
6        }
7        for(int i = 0; i < edges.length; i++){
8            int u = edges[i][0];
9            int v = edges[i][1];
10            adj.get(u).add(v);
11            adj.get(v).add(u);
12        }
13        int vist[]=new int[n];
14        Queue<Integer> q=new LinkedList<>();
15        vist[source]=1;
16        q.add(source);
17        while(!q.isEmpty())
18        {
19            int curr=q.poll();
20            if(curr == destination)
21            {
22                return true;
23            }
24            for(int k:adj.get(curr))
25            {
26                if(vist[k]==0)
27                {
28                    q.add(k);
29                    vist[k]=1;
30                }
31            }
32        }
33        return false;
34    }
35}