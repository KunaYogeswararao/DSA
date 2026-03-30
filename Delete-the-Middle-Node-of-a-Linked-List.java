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
12    public ListNode deleteMiddle(ListNode head) {
13        ListNode p=head;
14        ListNode f=head;
15        ListNode t=null;
16        if(head.next == null)
17        {
18            return null;
19        }
20        while(f != null && f.next != null)
21        {
22            t=p;
23            p=p.next;
24            f=f.next.next;
25        }
26    t.next=p.next;
27    return head;
28    }
29
30}