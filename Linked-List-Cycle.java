1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14    //   HashSet<ListNode> hm=new HashSet<>();
15    //         ListNode temp=head;
16    //   while(temp != null)
17    //   {
18    //     if(hm.contains(temp))
19    //     {
20    //         return true;
21    //     }
22    //     hm.add(temp);
23    //     temp=temp.next;
24    //   }
25    //   return false;
26        ListNode p=head;
27        ListNode f=head;
28        while(f != null && f.next!=null)
29        {
30            p=p.next;
31            f=f.next.next;
32            if(p == f)
33            {
34                return true;
35            }
36        }
37        return false;
38    }
39}