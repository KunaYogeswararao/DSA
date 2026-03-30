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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp=head;
14        while(temp != null && temp.next != null)
15        {
16            if(temp.val == temp.next.val)
17            {
18                temp.next=temp.next.next;
19            }
20            else
21            {
22                temp=temp.next;
23            }
24        }
25        return head;
26    }
27}