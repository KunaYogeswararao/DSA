1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        while(head != null && head.val==val)
14        {
15            head=head.next;
16        }
17         ListNode t=null;
18        ListNode p=head;
19        while(p != null )
20        {
21            if(p.val==val)
22            {
23                t.next=p.next;
24            }
25            else{
26            t=p;
27            }
28            p=p.next;
29        }
30        return head;
31    }
32}