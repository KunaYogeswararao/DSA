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
12    public ListNode middleNode(ListNode head) {
13        ListNode p=head;
14        ListNode f=head;
15        while(f != null && f.next != null)
16        {
17            p=p.next;
18            f=f.next.next;
19        }
20        return p;
21    }
22}